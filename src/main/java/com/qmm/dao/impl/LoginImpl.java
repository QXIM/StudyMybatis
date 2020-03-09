package com.qmm.dao.impl;

import com.qmm.dao.UserMapper;
import com.qmm.entity.Mybatis;
import com.qmm.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;


//基于Xml文件配置的Mybatis使用
public class LoginImpl implements UserMapper {


    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return 0;
    }

    @Override
    public int insert(User record) {

        return 0;

    }

    @Override
    public User selectByPrimaryKey(Integer userid) {
        return null;
    }


    @Override
    public List<User> selectAll() {

        SqlSessionFactory sqlSessionFactory = Mybatis.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> list = sqlSession.selectList("com.qmm.dao.UserMapper.selectAll");
        System.out.println("ok");
        System.out.println(list);
        if (list != null) {
            return list;

        } else {
            return null;
        }


    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }
}
