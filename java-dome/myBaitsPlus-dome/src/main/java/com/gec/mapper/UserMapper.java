package com.gec.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gec.pojo.User;

public interface UserMapper extends BaseMapper<User> {
    @Override
    int insert(User entity);
}
