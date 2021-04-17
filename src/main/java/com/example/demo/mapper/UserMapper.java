package com.example.demo.mapper;

import com.example.demo.bean.UserBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;


public interface UserMapper {

    UserBean getInfo(@Param("name") String name,@Param("password") String password);
}
