package com.exam.demo.Service.ServiceImp;

import com.exam.demo.Mapper.UserMapper;
import com.exam.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

@Autowired
UserMapper userMapper;

    @Override
    public Integer GetUserName(String username, String passward) {
        return userMapper.GetUserName(username,passward);
    }
}
