package com.exam.demo.POJO;

import lombok.Data;

import java.util.List;

@Data
public class City {

//    CREATE TABLE `city` (
//            `city_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '城市编号',
//            `city_name` varchar(32) DEFAULT NULL COMMENT '城市名字',
//    PRIMARY KEY (`city_id`)
//) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8


    private Long city_id;
    private String city_name;
    private List<County> listcounty;

}
