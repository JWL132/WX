package com.exam.demo.Mapper;



import com.exam.demo.POJO.City;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {


    List<City> GetCity_County();
}
