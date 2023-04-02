package com.cff.common.dynamic.inject;

import com.alibaba.fastjson2.JSON;
import com.cff.common.dynamic.inject.annotation.DynamicInject;
import com.cff.common.dynamic.inject.broker.DynamicBroker;
import com.cff.common.dynamic.inject.exception.BundleException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Class: com.cff.common.dynamic.inject.DynamicInjectRegister
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-02 16:58
 */
@Configuration
@Slf4j
public class DynamicInjectRegister implements InstantiationAwareBeanPostProcessor {

    private final DynamicBroker localDynamicBroker;

    private final Map<String, DynamicInvoker<?>> invokerMap = new ConcurrentHashMap<>();


    public DynamicInjectRegister(DynamicBroker dynamicBroker) {
        this.localDynamicBroker = dynamicBroker;
    }


    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        Class<?> aClass = bean.getClass();
        ReflectionUtils.doWithLocalFields(aClass, field -> {
            DynamicInject annotation = field.getAnnotation(DynamicInject.class);
            if(Objects.isNull(annotation)){
                if(!field.getType().isAssignableFrom(DynamicInvoker.class)){
                    throw new BundleException("annotation of 'DynamicInject' can only bee used on type of 'DynamicInvoker': bean of name"+beanName+" exists error field "+ field.getName());
                }
                Type genericType =  field.getGenericType();
                if(genericType instanceof ParameterizedType){
                    ParameterizedType parameterizedType = (ParameterizedType) genericType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    log.info(JSON.toJSONString(actualTypeArguments));
                    Class<?> acClass = (Class<?>) actualTypeArguments[0];
                    String serviceSpi = acClass.getTypeName();
                    DynamicInvoker<?> invoker = invokerMap.get(serviceSpi);
                    if(Objects.isNull(invoker)){
                        invoker = new DynamicInvoker<>(acClass, localDynamicBroker);
                        localDynamicBroker.register(acClass);
                        invokerMap.put(serviceSpi, invoker);
                    }
                    field.setAccessible(true);
                    field.set(bean, invoker);
                }
            }
        });
        return true;
    }
}
