package com.cff.common.dynamic.inject.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @Annotation: com.cff.common.dynamic.inject.annotation.ServiceBundle
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-02 16:29
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface ServiceBundle {
    /**
     * Bundle名称
     */
    String name();

    /**
     * 默认实现
     * @return
     */
    boolean primary() default false;

    /**
     * BundleID: 多个用逗号隔开
     * @return
     */
    String bundleIds() default "";
}
