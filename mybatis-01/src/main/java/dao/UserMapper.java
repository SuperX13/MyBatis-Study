package dao;

import pojo.User;

import java.util.List;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();
    //根据ID查询用户
    User getUserById(int id);
    //根据姓名查询用户
    User getUserByName(String name);
    //插入一个用户
    int addUser(User user);
}
