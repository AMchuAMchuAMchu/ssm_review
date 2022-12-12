package com.itcast;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itcast.dao.UserDao;
import com.itcast.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisPlus01ApplicationTests {


    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {

//        List<User> users = userDao.selectList(null);
//
//        users.forEach(System.out::println);
//        User user = new User();
//        user.setUsername("椎名真白1001");
//        user.setMoney(2000);
////        userDao.insert(user);
//
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//        lqw.eq(User::getUsername,"椎名真白");
//        userDao.update(user,lqw);

//        User user = new User("雪乃",2000);
//
//        userDao.insert(user);

//        userDao.deleteById(2);
//


//        Page<User> userPage = new Page<>(1,10);
//
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//
//        lqw.orderByDesc(User::getMoney);
//
//        Page<User> users = userDao.selectPage(userPage,lqw);

//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
//
//        lqw.ge(User::getMoney,2000).le(User::getMoney,3000);
//
//        List<User> users = userDao.selectList(lqw);
//
//        users.forEach(System.out::println);

//        QueryWrapper<User> qw = new QueryWrapper<>();
//
//        qw.groupBy("money");
//
//        List<User> users = userDao.selectList(qw);
//
//        users.forEach(System.out::println);

        QueryWrapper<User> qw = new QueryWrapper<>();

//        qw.select("count(*)");

        qw.select("max(money)");

        List<Map<String, Object>> maps = userDao.selectMaps(qw);

        System.out.println(maps);


    }

}
