package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import pojo.User;
import utils.MybatisUtils;

public class UserMapperTest {
    static Logger logger= Logger.getLogger(UserMapperTest.class);
    @Test
    public void getUserById(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=userMapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void testLog4j(){
        logger.info("info:进入了log4j");
        logger.debug("debug:进入了log4j");
        logger.error("error:进入了log4j");
    }
}
