import com.yyx.dao.BlogMapper;
import com.yyx.pojo.Blog;
import com.yyx.utils.IDUtils;
import com.yyx.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

public class MyTest {
    @Test
    public void testID() {
        System.out.println(IDUtils.getId());
        System.out.println(IDUtils.getId());
        System.out.println(IDUtils.getId());
    }

    @Test
    public void addBlogTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Java");
        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring");
        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务");
        mapper.addBook(blog);
        sqlSession.commit();
        sqlSession.close();
    }
}
