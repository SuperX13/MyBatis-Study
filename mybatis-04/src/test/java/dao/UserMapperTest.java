package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {

    @Test
    public void getUserByLimit(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("startIndex",0);
        map.put("pageSize",3);
        List<User> userList=userMapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
