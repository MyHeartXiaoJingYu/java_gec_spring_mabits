package com.gec.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gec.mapper.UserMapper;
import com.gec.pojo.User;
import com.gec.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
