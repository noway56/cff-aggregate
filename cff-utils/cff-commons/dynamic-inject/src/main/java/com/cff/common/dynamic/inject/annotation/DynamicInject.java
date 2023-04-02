package com.cff.common.dynamic.inject.annotation;

import java.lang.annotation.*;

/**
 * @Annotation: com.cff.common.dynamic.inject.annotation.DynamicInject
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-02 16:28
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DynamicInject {
}
