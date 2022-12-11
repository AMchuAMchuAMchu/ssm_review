package com.itcast.service.impl;

import com.itcast.dao.UserMapper;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.service.impl
 * Version ==> 1.0
 * CreateTime ==> 2022-12-11 15:34:49
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void transferToF(int money) {

        userMapper.updateM(money);
        int i = 10/0;
        userMapper.updateF(money);

    }

    @Override
    public void recordInfo(int money, String time) {
        userMapper.recordInfo(money,time);
    }
}
