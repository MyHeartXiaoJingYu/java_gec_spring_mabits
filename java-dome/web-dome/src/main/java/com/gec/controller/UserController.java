package com.gec.controller;

import com.gec.Service.UserService;
import com.gec.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser")
    @ResponseBody
    public void addUser(@RequestBody User user){
        this.userService.addUser(user);
    }

    @RequestMapping(value = "/findUserList")
    @ResponseBody
    public List<User> findUserList(){
        List<User> userList = this.userService.findUserList();
        return userList;
    }

    @RequestMapping(value = "/findUserById/{id}")
    @ResponseBody
    public User findUserById(@PathVariable int id){
        User user = this.userService.findUserById(id);
        return user;
    }

    @PostMapping("updateUserById")
    @ResponseBody
    public Map<String,Object> updateUserById(@RequestBody User user){
        boolean b = this.userService.updateUserById(user);
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("code",200);
        map.put("msg","返回数据正常");
        map.put("data",b);
        return map;
    }

    @RequestMapping(value = "/deleteUserById/{id}")
    @ResponseBody
    public int deleteUserById(int id){
        return this.userService.deleteUserById(id);
    }



//    @PostMapping("updateUser")
//    @ResponseBody
//    public Map<String,Object> updateUser(@RequestBody User user){
//
//
//        // 调用service得到数据库的数据
//        boolean b = this.userService.updateUserById(user);
//
//        Map<String,Object> map = new HashMap<String, Object>();
//        map.put("code",200);
//        map.put("msg","返回数据正常");
//        map.put("data",b);
//
//        return map;
//
//
//    }
}
