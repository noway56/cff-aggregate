package com.cff.common.loader;

import java.lang.annotation.*;

/**
 * @Annotation: com.cff.common.loader.MyInject
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-05 22:23
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
public @interface MyInject {
}
