package com.exam.demo.Controller;

import com.exam.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

@Controller
public class UserController {

    @Autowired
    UserService userService;


    /**
     * 用户账号登录
     * @param username
     * @param passward
     * @return
     */
    @GetMapping(value = "/login")
    @ResponseBody
    public Integer GetUserName(String username, String passward) {
        Integer user = userService.GetUserName(username, passward);
        System.out.println(user);
        if (user != null) {
            return user;
        }
        return null;
    }
    @GetMapping(value = "/sss",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String GetUserName1(String username, String passward) {
        if(!StringUtils.isEmpty(username)){
            return "登录成功";
        }

        return "登录失败";
    }
}
