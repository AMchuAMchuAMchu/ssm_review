package com.itcast.mapper;

import com.itcast.entity.User;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.dao.mapper
 * Version ==> 1.0
 * CreateTime ==> 2022-12-11 11:00:17
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public interface UserMapper {

    User selectUser(String username);

}
