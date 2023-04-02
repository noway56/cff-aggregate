package com.cff.common.dynamic.inject.broker;

/**
 * @Intereface: com.cff.common.dynamic.inject.broker.DynamicBroker
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-02 15:47
 */
public interface DynamicBroker {

    public <S> S get(Class<S> spiClass, String bundleId);

    void register(Class<?> spiClass);
}
