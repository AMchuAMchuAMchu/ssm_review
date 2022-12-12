package com.itcast.config;

import com.itcast.exception.ProjectExceptionHandler;
import com.itcast.interceptor.UserInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.config
 * Version ==> 1.0
 * CreateTime ==> 2022-12-12 09:49:08
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Configuration
@ComponentScan("com.itcast.service")
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
@Import({CFJdbc.class,CFMybatis.class, ProjectExceptionHandler.class, UserInterceptor.class})
public class CFSpring {
}
