package com.itcast.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.entity
 * Version ==> 1.0
 * CreateTime ==> 2022-12-12 13:21:35
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
@TableName(value = "user01")
public class User {

//    @TableId
    @TableLogic(value = "0",delval = "1")
    private int id;

    @TableField(value = "username")
    private String name;

    @TableField(select = false)
    private String money;

    @TableField(exist = false)
    private int uuid;



}
