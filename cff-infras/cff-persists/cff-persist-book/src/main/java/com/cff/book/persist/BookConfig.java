package com.cff.book.persist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Class: com.cff.book.persist.BookConfig
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-09 18:31
 */
@Configuration
@MapperScan(basePackages = {"com.cff.book"})
public class BookConfig {
}
