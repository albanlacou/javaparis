package com.coding.javaav.config;

import com.coding.javaav.dao.UserDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class WebMvcConfig {
    @Bean
     DriverManagerDataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/javaav");
        ds.setUsername("root");
        ds.setPassword("vincent");
        return ds;
    }

    @Primary
    @Bean
    public UserDAO getUserDAO(){
        return new UserDAO(getDataSource());
    }
}
