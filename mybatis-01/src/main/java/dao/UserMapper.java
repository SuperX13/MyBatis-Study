package dao;

import pojo.User;

import java.util.List;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();
    //根据ID查询用户
    User getUserById(int id);
    //插入一个用户
    int addUser(User user);
    //根据姓名删除用户
    int delUser(String name);
    //根据id修改用户
    int updUser(User user);
    //模糊查询
    List<User> getUserLike(String value);
}
