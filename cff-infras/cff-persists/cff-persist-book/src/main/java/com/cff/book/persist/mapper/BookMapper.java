package com.cff.book.persist.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cff.book.persist.po.BookPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Interface: com.cff.book.persist.mapper.BookMapper
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-08 23:35
 */
@Mapper
public interface BookMapper extends BaseMapper<BookPO> {
}
