package com.cff.common.dynamic.inject.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @Annotation: com.cff.common.dynamic.inject.annotation.ServiceSpi
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-02 16:34
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface ServiceSpi {

    /**
     * spi名称
     * @return
     */
    String name();
}
