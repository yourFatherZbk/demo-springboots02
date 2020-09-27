package com.offcn.demospringboots02.controller;


import com.offcn.demospringboots02.pojo.Offcn;
import com.offcn.demospringboots02.pojo.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testuser")
@EnableConfigurationProperties({Offcn.class, TestUser.class})
public class TestUserController {

    @Value("${offcn.xian}")
    String str;

    @Autowired
    TestUser testUser;

    @RequestMapping("get")
    public String getVlues(){
        return testUser+","+str;
    }

}
