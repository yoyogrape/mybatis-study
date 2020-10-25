package com.sjn.dao;

import com.sjn.opjo.User;
import com.sjn.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void findAll() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.getSqlSession();
            UserDao dao = sqlSession.getMapper(UserDao.class);
            List<User> userList = dao.findAll();
            for (User user : userList) {
                System.out.println(user);
            }
        } finally {
            sqlSession.close();
        }
    }

}
