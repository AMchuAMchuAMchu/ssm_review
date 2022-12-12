package com.itcast.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.config
 * Version ==> 1.0
 * CreateTime ==> 2022-12-12 09:53:45
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class CFMybatis {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage("com.itcast.entity");
        return sqlSessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer msc(){

        MapperScannerConfigurer msc = new MapperScannerConfigurer();

        msc.setBasePackage("com.itcast.mapper");

        return msc;

    }

}
