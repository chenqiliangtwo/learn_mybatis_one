package com.chen.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * SqlSession工具类
 *
 * @author chenqiliang
 * @version 1.0
 * 2023/02/02  16:30
 */
public class SqlSessionUtil {

    public static SqlSession getSqlSession(String configPath) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream(configPath);
        return new SqlSessionFactoryBuilder().build(resourceAsStream).openSession(true);
    }
}
