package com.chen.action;

import com.chen.domain.User;
import com.chen.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * TODO 类描述
 *
 * @version 1.0
 * @auth chenqiliang
 * @date 2023-02-01 22:02
 */
public class Test {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(inputStream);

        SqlSession sqlSession = sessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int i = mapper.insertUser(new User("123", "zhangsan", 18));

        System.out.println(i);
    }
}
