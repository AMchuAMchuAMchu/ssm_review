package com.itcast.service.impl;

import com.itcast.entity.User;
import com.itcast.mapper.UserMapper;
import com.itcast.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.service.impl
 * Version ==> 1.0
 * CreateTime ==> 2022-12-11 11:12:01
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private SqlSession sqlSession;

    @Override
    public void selectUser(String username) {
        System.out.println("service...");
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectUser(username);
        System.out.println(user);
    }
}
