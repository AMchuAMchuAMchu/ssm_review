package com.itcast.entity;

import lombok.Data;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.entity
 * Version ==> 1.0
 * CreateTime ==> 2022-12-12 10:19:51
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
public class R<T> {

    private int status;

    private String msg;

    private T t;

    public R(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public R(int status, String msg, T t) {
        this.status = status;
        this.msg = msg;
        this.t = t;
    }
}
