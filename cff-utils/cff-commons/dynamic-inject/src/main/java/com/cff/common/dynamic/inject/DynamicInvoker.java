package com.cff.common.dynamic.inject;

import com.cff.common.dynamic.inject.broker.DynamicBroker;

/**
 * @Class: com.cff.common.dynamic.inject.DynamicInvoker
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-02 15:43
 */
public class DynamicInvoker<S> {

    private final Class<S> spiClass;

    private final DynamicBroker dynamicBroker;

    public DynamicInvoker(Class<S> spiClass, DynamicBroker dynamicBroker) {
        this.spiClass = spiClass;
        this.dynamicBroker = dynamicBroker;
    }

    public S getService(String bundleId){
        return dynamicBroker.get(spiClass, bundleId);
    }
}
