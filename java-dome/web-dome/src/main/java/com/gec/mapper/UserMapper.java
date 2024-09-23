package com.gec.mapper;

import com.gec.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserMapper {
    int insertUser(User user);
    public List<User> findUserList();
    public User findUserById(int id);
    public boolean updateUserById(User user);

    public int deleteUserById(int i);
}
