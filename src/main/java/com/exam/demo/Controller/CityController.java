package com.exam.demo.Controller;

import com.exam.demo.POJO.City;
import com.exam.demo.Service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private TestService testservice;

    /*
      获取当前市所有得区
      后期在做修改
      返回值 List<City>
     */

    @RequestMapping("/GetCity_County" )
    public @ResponseBody
    List<City> GetCity_County() {
//        List<City> list = testservice.GetCity_County();
////        for (City city : list) {
////            System.out.println(list);
////        }

        return testservice.GetCity_County();

    }

    @RequestMapping("/hello")
    public  String hello() {
//        List<City> list = testservice.GetCity_County();
////        for (City city : list) {
////            System.out.println(list);
////        }
        System.out.println("你好啊");
        return "/login";

    }
}
