package com.yiidian.test;

import com.yiidian.dao.UserDao;
import com.yiidian.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 单独测试MyBatis环境是否OK
 *一点教程网 - www.yiidian.com
 */
public class TestMyBatis {
    @Test
    public void testFindAll() throws IOException {

        //1.加载SqlMapConfig.xml
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2.创建SqlSessionFactory
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);

        //3.创建SqlSession
        SqlSession sqlSession = factory.openSession();

        //4.创建Dao代理对象
        UserDao accountDao = sqlSession.getMapper(UserDao.class);

        //5.执行方法
        List<User> list = accountDao.findAll();
        System.out.println(list);

        //6.释放资源
        sqlSession.close();
        in.close();

    }
}
