package dao;

import pojo.User;

public interface UserMapper {
    //根据ID查询用户
    User getUserById(int id);
}
