package com.cff.test.book;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cff.book.persist.mapper.BookMapper;
import com.cff.book.persist.po.BookPO;
import com.cff.starter.Application;
import com.cff.test.BaseSpringTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Class: PACKAGE_NAME.BookTest
 * @Desc:
 * @author: luwu
 * @Date: 2023-05-13 16:50
 */
@Slf4j
@SpringBootTest(classes = Application.class)
public class BookTest {

    @Resource
    private BookMapper bookMapper;
    @Test
    public void testBookMappeer(){
        Wrapper<BookPO> wrapper = new QueryWrapper<>();
        bookMapper.selectOne(wrapper);
    }

}
