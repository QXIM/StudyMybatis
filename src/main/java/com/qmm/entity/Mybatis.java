package com.qmm.entity;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Mybatis {


    static SqlSessionFactory sqlSessionFactory;
    static String resource = "MyBatis-config.xml";
    static Reader reader = null;

    static {
        try {
            reader = Resources.getResourceAsReader(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }


    public static void closeSqlsession(SqlSession sqlSession ) {
        sqlSession.close();
    }

}
