package com.vueTest.controller;

import com.vueTest.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class vueController {

    @RequestMapping("/vue")
    public Map<String,Object> vue(String str){
        System.out.println("---"+str);

        User user = new User(1,"yiyuyu1",20,"smallfish1");
        User user1 = new User(2,"yiyuyu2",20,"smallfish2");
        User user2 = new User(3,"yiyuyu3",20,"smallfish3");
        User user3 = new User(4,"yiyuyu4",20,"smallfish4");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);

        Map<String,Object> map =new HashMap<>();
        map.put("code",200);
        map.put("msg","返回数据");
        map.put("data",users);

        return map;

    };

}
