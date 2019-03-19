package com.exam.demo.POJO;

import lombok.Data;

import java.util.Locale;
@Data
public class County {
//    CREATE TABLE `county` (
//            `county_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '先编号',
//            `county_city_id` bigint(32) DEFAULT NULL COMMENT '城市编号',
//            `county_name` varchar(32) DEFAULT NULL COMMENT '区/县',
//    PRIMARY KEY (`county_id`)
//) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8
    private Long county_id;
    private Long county_city_id;
    private String county_name;

}
