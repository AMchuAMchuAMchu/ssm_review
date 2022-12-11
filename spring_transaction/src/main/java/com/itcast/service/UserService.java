package com.itcast.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.service
 * Version ==> 1.0
 * CreateTime ==> 2022-12-11 15:34:04
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
//@Transactional()
public interface UserService {

    @Transactional
    void transferToF(int money);

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void recordInfo(int money, String time);

}
