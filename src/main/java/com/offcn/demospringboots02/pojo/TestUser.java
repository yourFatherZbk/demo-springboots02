package com.offcn.demospringboots02.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Configuration  //加载自定义属性资源文件时需要添加Configuration注解
@PropertySource("classpath:test.properties") //从指定的配置文件中加载参数
@ConfigurationProperties(prefix = "testuser") //配置文件中配置的文件前缀
public class TestUser {
    private String name;
    private String password;
    private String birthday;
}
