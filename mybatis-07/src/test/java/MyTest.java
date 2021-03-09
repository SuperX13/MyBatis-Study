import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.yyx.dao.TeacherMapper;
import com.yyx.pojo.Teacher;
import com.yyx.utils.MybatisUtils;

public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(2);
        System.out.println(teacher);
        sqlSession.close();
    }
}
