package com.itcast;

import com.itcast.dao.UserDao;
import com.itcast.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlus01ApplicationTests {


    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {

//        List<User> users = userDao.selectList(null);
//
//        users.forEach(System.out::println);
        User user = new User();
        user.setUsername("椎名真白");
        user.setMoney(2000);
        userDao.insert(user);

    }

}
