-- stock.stock_120min definition

CREATE TABLE `stock_120min` (
                                `id` bigint(20) NOT NULL,
                                `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券名',
                                `code` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券代码',
                                `days` date NOT NULL COMMENT '数据所属日期',
                                `ticks` int(11) NOT NULL COMMENT '当日第几个数据',
                                `h` bigint(20) NOT NULL COMMENT '最大值',
                                `l` bigint(20) NOT NULL COMMENT '最小值',
                                `o` bigint(20) NOT NULL COMMENT '起始值',
                                `c` bigint(20) NOT NULL COMMENT '最终值',
                                `ema5` bigint(20) NOT NULL COMMENT 'ema5',
                                `ema10` bigint(20) NOT NULL COMMENT 'ema10',
                                `ema20` bigint(20) NOT NULL COMMENT 'ema20',
                                `ema60` bigint(20) NOT NULL COMMENT 'ema60',
                                `vol` bigint(20) NOT NULL COMMENT '成交量',
                                `vol_ema5` decimal(20,3) NOT NULL COMMENT '成交量平均5',
                                `vol_ema20` decimal(20,3) NOT NULL COMMENT '成交量平均10',
                                `vol_ema10` decimal(20,3) NOT NULL COMMENT '成交量平均20',
                                `vol_ema45` decimal(20,3) NOT NULL COMMENT '成交量平均45',
                                `vol_ema135` decimal(20,3) NOT NULL COMMENT '成交量平均135',
                                `macd` decimal(20,3) DEFAULT NULL COMMENT 'macd',
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='120min stock';

-- stock.stock_1min definition

CREATE TABLE `stock_1min` (
                              `id` bigint(20) NOT NULL,
                              `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券名',
                              `code` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券代码',
                              `days` date NOT NULL COMMENT '数据所属日期',
                              `ticks` int(11) NOT NULL COMMENT '当日第几个数据',
                              `h` bigint(20) NOT NULL COMMENT '最大值',
                              `l` bigint(20) NOT NULL COMMENT '最小值',
                              `o` bigint(20) NOT NULL COMMENT '起始值',
                              `c` bigint(20) NOT NULL COMMENT '最终值',
                              `ema5` bigint(20) NOT NULL COMMENT 'ema5',
                              `ema10` bigint(20) NOT NULL COMMENT 'ema10',
                              `ema20` bigint(20) NOT NULL COMMENT 'ema20',
                              `ema60` bigint(20) NOT NULL COMMENT 'ema60',
                              `vol` bigint(20) NOT NULL COMMENT '成交量',
                              `vol_ema5` decimal(20,3) NOT NULL COMMENT '成交量平均5',
                              `vol_ema20` decimal(20,3) NOT NULL COMMENT '成交量平均10',
                              `vol_ema10` decimal(20,3) NOT NULL COMMENT '成交量平均20',
                              `vol_ema45` decimal(20,3) NOT NULL COMMENT '成交量平均45',
                              `vol_ema135` decimal(20,3) NOT NULL COMMENT '成交量平均135',
                              `macd` decimal(20,3) DEFAULT NULL COMMENT 'macd',
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='1min stock';

-- stock.stock_30min definition

CREATE TABLE `stock_30min` (
                               `id` bigint(20) NOT NULL,
                               `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券名',
                               `code` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券代码',
                               `days` date NOT NULL COMMENT '数据所属日期',
                               `ticks` int(11) NOT NULL COMMENT '当日第几个数据',
                               `h` bigint(20) NOT NULL COMMENT '最大值',
                               `l` bigint(20) NOT NULL COMMENT '最小值',
                               `o` bigint(20) NOT NULL COMMENT '起始值',
                               `c` bigint(20) NOT NULL COMMENT '最终值',
                               `ema5` bigint(20) NOT NULL COMMENT 'ema5',
                               `ema10` bigint(20) NOT NULL COMMENT 'ema10',
                               `ema20` bigint(20) NOT NULL COMMENT 'ema20',
                               `ema60` bigint(20) NOT NULL COMMENT 'ema60',
                               `vol` bigint(20) NOT NULL COMMENT '成交量',
                               `vol_ema5` decimal(20,3) NOT NULL COMMENT '成交量平均5',
                               `vol_ema20` decimal(20,3) NOT NULL COMMENT '成交量平均10',
                               `vol_ema10` decimal(20,3) NOT NULL COMMENT '成交量平均20',
                               `vol_ema45` decimal(20,3) NOT NULL COMMENT '成交量平均45',
                               `vol_ema135` decimal(20,3) NOT NULL COMMENT '成交量平均135',
                               `macd` decimal(20,3) DEFAULT NULL COMMENT 'macd',
                               PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='30min stock';

-- stock.stock_5min definition

CREATE TABLE `stock_5min` (
                              `id` bigint(20) NOT NULL,
                              `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券名',
                              `code` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券代码',
                              `days` date NOT NULL COMMENT '数据所属日期',
                              `ticks` int(11) NOT NULL COMMENT '当日第几个数据',
                              `h` bigint(20) NOT NULL COMMENT '最大值',
                              `l` bigint(20) NOT NULL COMMENT '最小值',
                              `o` bigint(20) NOT NULL COMMENT '起始值',
                              `c` bigint(20) NOT NULL COMMENT '最终值',
                              `ema5` bigint(20) NOT NULL COMMENT 'ema5',
                              `ema10` bigint(20) NOT NULL COMMENT 'ema10',
                              `ema20` bigint(20) NOT NULL COMMENT 'ema20',
                              `ema60` bigint(20) NOT NULL COMMENT 'ema60',
                              `vol` bigint(20) NOT NULL COMMENT '成交量',
                              `vol_ema5` decimal(20,3) NOT NULL COMMENT '成交量平均5',
                              `vol_ema20` decimal(20,3) NOT NULL COMMENT '成交量平均10',
                              `vol_ema10` decimal(20,3) NOT NULL COMMENT '成交量平均20',
                              `vol_ema45` decimal(20,3) NOT NULL COMMENT '成交量平均45',
                              `vol_ema135` decimal(20,3) NOT NULL COMMENT '成交量平均135',
                              `macd` decimal(20,3) DEFAULT NULL COMMENT 'macd',
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='5min stock';

-- stock.stock_60min definition

CREATE TABLE `stock_60min` (
                               `id` bigint(20) NOT NULL,
                               `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券名',
                               `code` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券代码',
                               `days` date NOT NULL COMMENT '数据所属日期',
                               `ticks` int(11) NOT NULL COMMENT '当日第几个数据',
                               `h` bigint(20) NOT NULL COMMENT '最大值',
                               `l` bigint(20) NOT NULL COMMENT '最小值',
                               `o` bigint(20) NOT NULL COMMENT '起始值',
                               `c` bigint(20) NOT NULL COMMENT '最终值',
                               `ema5` bigint(20) NOT NULL COMMENT 'ema5',
                               `ema10` bigint(20) NOT NULL COMMENT 'ema10',
                               `ema20` bigint(20) NOT NULL COMMENT 'ema20',
                               `ema60` bigint(20) NOT NULL COMMENT 'ema60',
                               `vol` bigint(20) NOT NULL COMMENT '成交量',
                               `vol_ema5` decimal(20,3) NOT NULL COMMENT '成交量平均5',
                               `vol_ema20` decimal(20,3) NOT NULL COMMENT '成交量平均10',
                               `vol_ema10` decimal(20,3) NOT NULL COMMENT '成交量平均20',
                               `vol_ema45` decimal(20,3) NOT NULL COMMENT '成交量平均45',
                               `vol_ema135` decimal(20,3) NOT NULL COMMENT '成交量平均135',
                               `macd` decimal(20,3) DEFAULT NULL COMMENT 'macd',
                               PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='60min stock';

-- stock.stock_day definition

CREATE TABLE `stock_day` (
                             `id` bigint(20) NOT NULL,
                             `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券名',
                             `code` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券代码',
                             `days` date NOT NULL COMMENT '数据所属日期',
                             `ticks` int(11) NOT NULL COMMENT '当日第几个数据',
                             `h` bigint(20) NOT NULL COMMENT '最大值',
                             `l` bigint(20) NOT NULL COMMENT '最小值',
                             `o` bigint(20) NOT NULL COMMENT '起始值',
                             `c` bigint(20) NOT NULL COMMENT '最终值',
                             `ema5` bigint(20) NOT NULL COMMENT 'ema5',
                             `ema10` bigint(20) NOT NULL COMMENT 'ema10',
                             `ema20` bigint(20) NOT NULL COMMENT 'ema20',
                             `ema60` bigint(20) NOT NULL COMMENT 'ema60',
                             `vol` bigint(20) NOT NULL COMMENT '成交量',
                             `vol_ema5` decimal(20,3) NOT NULL COMMENT '成交量平均5',
                             `vol_ema20` decimal(20,3) NOT NULL COMMENT '成交量平均10',
                             `vol_ema10` decimal(20,3) NOT NULL COMMENT '成交量平均20',
                             `vol_ema45` decimal(20,3) NOT NULL COMMENT '成交量平均45',
                             `vol_ema135` decimal(20,3) NOT NULL COMMENT '成交量平均135',
                             `macd` decimal(20,3) DEFAULT NULL COMMENT 'macd',
                             PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='day stock';

-- stock.stock_month definition

CREATE TABLE `stock_month` (
                               `id` bigint(20) NOT NULL,
                               `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券名',
                               `code` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券代码',
                               `days` date NOT NULL COMMENT '数据所属日期',
                               `ticks` int(11) NOT NULL COMMENT '当日第几个数据',
                               `h` bigint(20) NOT NULL COMMENT '最大值',
                               `l` bigint(20) NOT NULL COMMENT '最小值',
                               `o` bigint(20) NOT NULL COMMENT '起始值',
                               `c` bigint(20) NOT NULL COMMENT '最终值',
                               `ema5` bigint(20) NOT NULL COMMENT 'ema5',
                               `ema10` bigint(20) NOT NULL COMMENT 'ema10',
                               `ema20` bigint(20) NOT NULL COMMENT 'ema20',
                               `ema60` bigint(20) NOT NULL COMMENT 'ema60',
                               `vol` bigint(20) NOT NULL COMMENT '成交量',
                               `vol_ema5` decimal(20,3) NOT NULL COMMENT '成交量平均5',
                               `vol_ema20` decimal(20,3) NOT NULL COMMENT '成交量平均10',
                               `vol_ema10` decimal(20,3) NOT NULL COMMENT '成交量平均20',
                               `vol_ema45` decimal(20,3) NOT NULL COMMENT '成交量平均45',
                               `vol_ema135` decimal(20,3) NOT NULL COMMENT '成交量平均135',
                               `macd` decimal(20,3) DEFAULT NULL COMMENT 'macd',
                               PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='month stock';

-- stock.stock_week definition

CREATE TABLE `stock_week` (
                              `id` bigint(20) NOT NULL,
                              `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券名',
                              `code` varchar(40) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '证券代码',
                              `days` date NOT NULL COMMENT '数据所属日期',
                              `ticks` int(11) NOT NULL COMMENT '当日第几个数据',
                              `h` bigint(20) NOT NULL COMMENT '最大值',
                              `l` bigint(20) NOT NULL COMMENT '最小值',
                              `o` bigint(20) NOT NULL COMMENT '起始值',
                              `c` bigint(20) NOT NULL COMMENT '最终值',
                              `ema5` bigint(20) NOT NULL COMMENT 'ema5',
                              `ema10` bigint(20) NOT NULL COMMENT 'ema10',
                              `ema20` bigint(20) NOT NULL COMMENT 'ema20',
                              `ema60` bigint(20) NOT NULL COMMENT 'ema60',
                              `vol` bigint(20) NOT NULL COMMENT '成交量',
                              `vol_ema5` decimal(20,3) NOT NULL COMMENT '成交量平均5',
                              `vol_ema20` decimal(20,3) NOT NULL COMMENT '成交量平均10',
                              `vol_ema10` decimal(20,3) NOT NULL COMMENT '成交量平均20',
                              `vol_ema45` decimal(20,3) NOT NULL COMMENT '成交量平均45',
                              `vol_ema135` decimal(20,3) NOT NULL COMMENT '成交量平均135',
                              `macd` decimal(20,3) DEFAULT NULL COMMENT 'macd',
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='week stock';