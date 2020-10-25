package com.sjn.dao;

import com.sjn.opjo.User;
import com.sjn.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void findAll() {
        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            UserDao dao = sqlSession.getMapper(UserDao.class);
            List<User> userList = dao.findAll();
            for (User user : userList) {
                System.out.println(user);
            }
        }
    }

    @Test
    public void findByName() {
        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            UserDao dao = sqlSession.getMapper(UserDao.class);
//            List<User> zh = dao.findByName("%zh%");
            List<User> zh = dao.findByName("zh");
            for (User user : zh) {
                System.out.println(user);
            }
        }
    }

    /**
     * 增删改需要提交事务
     */
    @Test
    public void add() {
        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
            UserDao dao = sqlSession.getMapper(UserDao.class);
            dao.addUser(new User("zhansan","1234"));
            sqlSession.commit();
        }
    }
}
