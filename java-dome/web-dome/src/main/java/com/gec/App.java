package com.gec;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// 标记他是一个springboot程序

// App 类  称之为  springboot 启动类
@SpringBootApplication
@MapperScan("com/gec/mapper")
//@ComponentScan("com.gec.controller")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
