package com.cff.book.persist.po;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.cff.book.domain.Book;
import lombok.Data;

import java.util.Date;

/**
 * @Class: com.cff.book.persist.po.BookPO
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-08 23:24
 */
@Data
@TableName("book")
public class BookPO extends Book {

    @TableId(type=IdType.AUTO)
    private Long id;

    private Date createdAt;

    private Date modifiedAt;

    private Date deletedAt;
}
