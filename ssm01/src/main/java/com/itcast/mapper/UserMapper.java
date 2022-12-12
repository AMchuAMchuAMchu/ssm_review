package com.itcast.mapper;

import com.itcast.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.mapper
 * Version ==> 1.0
 * CreateTime ==> 2022-12-12 10:00:53
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public interface UserMapper {

    @Select("select * from user")
    List<User> selectUsers();

    @Select("insert into user values(#{username},#{money})")
    Integer insertUser(@Param("username") String username,@Param("money") String money);

}
