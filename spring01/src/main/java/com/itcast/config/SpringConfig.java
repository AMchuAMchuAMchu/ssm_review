package com.itcast.config;

import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.config
 * Version ==> 1.0
 * CreateTime ==> 2022-12-11 09:31:56
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Configuration
@ComponentScan("com.itcast")
@PropertySource("classpath:jdbc.properties")
@Import(GainDruidDataSource.class)
public class SpringConfig {


}
