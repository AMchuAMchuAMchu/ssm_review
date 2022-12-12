package com.itcast.entity;

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
public class User {

    private int id;

    private String username;

    private String money;

    public User(int id, String username, String money) {
        this.id = id;
        this.username = username;
        this.money = money;
    }

    public User(String username, String money) {
        this.username = username;
        this.money = money;
    }

    public User() {
    }
}
