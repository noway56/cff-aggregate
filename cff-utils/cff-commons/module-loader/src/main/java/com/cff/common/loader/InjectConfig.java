package com.cff.common.loader;

import lombok.Data;

/**
 * @Class: com.cff.common.loader.InjectConfig
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-05 22:26
 */
@MyInject
@Data
public class InjectConfig {
    @Override
    public String toString(){
        return this.getClass() + "MyInject";
    }
}
