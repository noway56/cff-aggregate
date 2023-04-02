package com.cff.common.dynamic.inject.broker.impl;

import com.cff.common.dynamic.inject.annotation.ServiceBundle;
import com.cff.common.dynamic.inject.broker.DynamicBroker;
import com.cff.common.dynamic.inject.exception.BundleException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Class: com.cff.common.dynamic.inject.broker.impl.LocalDynamicBroker
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-02 15:51
 */
@Slf4j
@Service
public class LocalDynamicBroker implements DynamicBroker, ApplicationContextAware {


    /**
     * key: spi
     * value:
     *   key: bundleId
     *   value: 实现类
     */
    private final Map<Class<?>, Map<String, Object>> bundleCache = new ConcurrentHashMap<>();

    /**
     * 每个spi的默认实现
     * key: spi
     * value: 默认实现
     */
    private final Map<Class<?>, Object> defaultImplMap = new ConcurrentHashMap<>();

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public <S> S get(Class<S> spiClass, String bundleId) {
        Map<String, Object> serviceMap = bundleCache.get(spiClass);
        Object obj = serviceMap.get(bundleId);
        if(null == obj){
            obj = defaultImplMap.get(bundleId);
        }
        if(null == obj){
            throw new BundleException("No qualifying bean ooof type '" + spiClass.getClass() +"' availablee: \n" +
                    "excepted at least 1 bean which qualifies as DynamicInject candidate for bundleId '" + bundleId + "'");
        }
        return (S)obj;
    }

    @Override
    public void register(Class<?> spiClass) {
        Map<String,?> bundleMap = applicationContext.getBeansOfType(spiClass);
        if(bundleMap.size() == 0){
            throw new BundleException("No qualifying bean ooof type '" + spiClass.getClass() +"' availablee: \n" +
                    "excepted at least 1 bean which qualifies as DynamicInject candidate.");
        }
        for(String beanName: bundleMap.keySet()){
            Object obj = bundleMap.get(beanName);
            Class<?> targetClass = AopUtils.getTargetClass(obj);
            ServiceBundle bundle = targetClass.getAnnotation(ServiceBundle.class);
            if(Objects.isNull(bundle)){
                log.warn("Registe bundle fail: beanName：{} lack @ServiceBundle annotation", beanName);
                continue;
            }
            String bundleIds = bundle.bundleIds();
            if(StringUtils.isNoneBlank(bundleIds)){
                Arrays.stream(StringUtils.split(bundleIds, ",")).toList().forEach(bundleId ->{
                    bundleCache.computeIfAbsent(spiClass, k->new ConcurrentHashMap<>()).put(bundleId, obj);
                });
            }

            boolean primary = bundle.primary();
            if(primary){
                defaultImplMap.putIfAbsent(spiClass, obj);
            }
        }
    }

}
