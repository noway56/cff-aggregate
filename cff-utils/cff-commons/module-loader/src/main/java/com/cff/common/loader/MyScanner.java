package com.cff.common.loader;

import lombok.Data;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

/**
 * @Class: com.cff.common.loader.MyScanner
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-05 22:27
 */
public class MyScanner extends ClassPathBeanDefinitionScanner {

    private Class annotationClass;

    public void setAnnotationClass(Class annotationClass) {
        this.annotationClass = annotationClass;
    }

    public MyScanner(BeanDefinitionRegistry registry) {
        super(registry);
    }
}
