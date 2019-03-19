package com.exam.demo.Service.ServiceImp;

import com.exam.demo.Mapper.TestMapper;
import com.exam.demo.POJO.City;
import com.exam.demo.Service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImp implements TestService {

    @Autowired
    private TestMapper testmapper;


    @Override
    public List<City> GetCity_County() {
        return testmapper.GetCity_County();
    }
}
