-- cff.book definition

drop table if exists `book`;
CREATE TABLE `book`(
   `id` bigint(20) NOT NULL COMMENT '主键',
   `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   `modified_at` datetime DEFAULT NULL COMMENT '修改时间',
   `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
   `del_flag` tinyint not null default 0 COMMENT '删除标志， 0-否， 1-是',
   `pk` bigint(20) NOT NULL COMMENT '书籍主键',
   `subject` varchar(200) COMMENT '主题词',
   `serial_name` varchar(200) COMMENT '丛书名',
   `serial_seq` int COMMENT '丛书的序列号',
   `author` varchar(100) COMMENT '作者',
   `publisher` varchar(64) COMMENT '出版社',
   `pub_time` datetime COMMENT '出版时间',
   `pages` int COMMENT '页数',
   `isbn` varchar(128) COMMENT 'isbn',
   `title` varchar(200) COMMENT '书名',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '书籍';

drop table if exists `publisher`;
create table `publisher`(
    `id` bigint(20) NOT NULL COMMENT '主键',
    `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modified_at` datetime DEFAULT NULL COMMENT '修改时间',
    `deleted_at` datetime DEFAULT NULL COMMENT '删除时间',
    `del_flag` tinyint not null default 0 COMMENT '删除标志， 0-否， 1-是',
    `pk` bigint(20) NOT NULL COMMENT '出版社主键',
    `name` varchar(64) comment '出版社名字',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '出版社';


