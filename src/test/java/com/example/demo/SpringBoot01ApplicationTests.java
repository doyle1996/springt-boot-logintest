package com.example.demo;

import com.example.demo.bean.UserBean;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//让测试运行于Spring测试环境，以便在测试开始的时候自动创建Spring的应用上下文
@RunWith(SpringRunner.class)

@SpringBootTest
class SpringBoot01ApplicationTests {
    @Autowired
    UserService userService;
    @Test
    public void contextLoads() {
        UserBean userBean=userService.loginIn("zhang","123");
        System.out.println("该用户的id:");
        System.out.println(userBean.getId());


    }

}
