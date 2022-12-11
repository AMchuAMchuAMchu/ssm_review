package com.itcast.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.config
 * Version ==> 1.0
 * CreateTime ==> 2022-12-11 15:26:29
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class CFMybatis {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
        sfb.setDataSource(dataSource);
        sfb.setTypeAliasesPackage("com.itcast.entity");
        return sfb;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){

        MapperScannerConfigurer sc = new MapperScannerConfigurer();

        sc.setBasePackage("com.itcast.dao");

        return sc;

    }


}
