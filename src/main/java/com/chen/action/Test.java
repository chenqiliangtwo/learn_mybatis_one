package com.chen.action;

import com.chen.domain.User;
import com.chen.mapper.UserMapper;
import com.chen.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

/**
 * 测试类
 *
 * @version 1.0
 * @auth chenqiliang
 * @date 2023-02-01 22:02
 */
public class Test {
    public static void main(String[] args) throws IOException {

        SqlSession sqlSession = SqlSessionUtil.getSqlSession("mybatis-config.xml");

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int i = mapper.insertUser(new User("123", "zhangsan", 18));

        System.out.println(i);
    }
}
