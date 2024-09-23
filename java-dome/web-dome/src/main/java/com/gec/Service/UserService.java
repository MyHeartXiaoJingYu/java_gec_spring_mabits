package com.gec.Service;

import com.gec.pojo.User;

import java.util.List;


public interface UserService {
        public void addUser(User user);
        public List<User> findUserList();
        public User findUserById(int id);
        public boolean updateUserById(User user);
        public int deleteUserById(int i);
    }

