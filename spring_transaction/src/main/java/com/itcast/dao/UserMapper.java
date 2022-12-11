package com.itcast.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import java.time.LocalDateTime;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-12-11 15:29:39
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public interface UserMapper {

    @Update("update user set money = money - #{money} where username = '樱满集'")
    void updateM(int money);

    @Update("update user set money = money + #{money} where username = '楪祈'")
    void updateF(int money);

    @Insert("insert into log_account values ('樱满集','楪祈',#{money},#{time})")
    void recordInfo(int money, String time);

}
