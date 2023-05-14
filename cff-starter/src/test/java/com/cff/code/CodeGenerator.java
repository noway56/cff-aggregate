package com.cff.code;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.cff.test.BaseSpringTest;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Collections;

/**
 * @Class: com.cff.code.CodeGenerator
 * @Desc:
 * @author: luwu
 * @Date: 2023-05-14 15:38
 */
public class CodeGenerator extends BaseSpringTest {

    /**
     * 数据源配置
     */
    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig()
            .setUrl("jdbc:mysql://localhost:33060/cff")
            .setDbType(DbType.MYSQL)
            .setDriverName("com.mysql.cj.jdbc.Driver")
            .setUsername("rooot")
            .setPassword("123456");

    @Test
    public void testSimple() {
        AutoGenerator generator = new AutoGenerator();
        generator.setDataSource(DATA_SOURCE_CONFIG);
        generator.setStrategy(new StrategyConfig());
        generator.setGlobalConfig(new GlobalConfig());
        generator.execute();
    }




}
