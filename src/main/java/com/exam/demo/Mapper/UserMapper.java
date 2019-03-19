package com.exam.demo.Mapper;


import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    Integer GetUserName(String username, String passward);

}
