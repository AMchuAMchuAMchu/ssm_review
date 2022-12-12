package com.itcast.service;

import com.itcast.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.service
 * Version ==> 1.0
 * CreateTime ==> 2022-12-12 10:03:24
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Transactional
public interface UserService {

    List<User> selectUsers();

    boolean insertUser(String username,int money);

}
