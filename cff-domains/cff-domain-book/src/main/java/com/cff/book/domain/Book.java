package com.cff.book.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Class: com.cff.book.domain.Book
 * @Desc:
 * @author: luwu
 * @Date: 2023-04-08 22:42
 */
@Data
public class Book {

    private Long pk;

    /**
     * 书名
     */
    private String title;

    /**
     * 主题词
     */
    private String subject;

    /**
     * 丛书名
     */
    private String serialName;

    /**
     * 作者
     */
    private String author;

    /**
     * 出版社
     */
    private String publish;

    private Date pubTime;


    private Integer pages;

    private String isbn;

    private String rating;

    private String cover;

}
