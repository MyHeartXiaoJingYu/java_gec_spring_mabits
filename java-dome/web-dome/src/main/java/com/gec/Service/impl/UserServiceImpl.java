package com.gec.Service.impl;

import com.gec.Service.UserService;
import com.gec.pojo.User;
import com.gec.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(User user) {
        int i = this.userMapper.insertUser(user);
        System.out.println(i);
    }

    @Override
    public List<User> findUserList() {
        return this.userMapper.findUserList();
    }

    @Override
    public User findUserById(int id) {
        return this.userMapper.findUserById(id);
    }

    @Override
    public boolean updateUserById(User user) {
        return this.userMapper.updateUserById(user);
    }

    @Override
    public int deleteUserById(int i) {
        return this.userMapper.deleteUserById(i);
    }
}
