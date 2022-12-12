package com.itcast.service.impl;

import com.itcast.entity.User;
import com.itcast.mapper.UserMapper;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.service.impl
 * Version ==> 1.0
 * CreateTime ==> 2022-12-12 10:03:57
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUsers() {
        List<User> users = userMapper.selectUsers();
        System.out.println(users);
        System.out.println("service...");
        return users;
    }

    @Override
    public boolean insertUser(String username, String money) {userMapper.insertUser(username, money);
        System.out.println("service...");
        return true;
    }
}
