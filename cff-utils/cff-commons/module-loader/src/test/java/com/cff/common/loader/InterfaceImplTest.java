package com.cff.common.loader;

import com.cff.common.loader.core.ClassFinder;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Set;

/**
 * @Class: com.cff.common.loader.InterfaceImplTest
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-02 21:30
 */
@Slf4j
public class InterfaceImplTest {

    @Test
    void sampleATest(){
//        Set<Class<?>> classes = ClassFinder.findAndAddClassesInPackageByFile("com.cff.user.domain.service","/Users/luwu/workspace/prepared/cff-aggregate/cff-utils/cff-commons/module-loader/src/test/java/com/cff/common/loader/lib/", false);
        Set<Class<?>> classes = ClassFinder.getClasses("com.cff.user.domain");
        log.info(classes.toString());
        System.out.println(classes.toString());
        for(Object t: classes){
            Class<?> tt = (Class<?>)t;
            System.out.println(tt.getName());
            log.info(tt.getName());
        }

    }
}
