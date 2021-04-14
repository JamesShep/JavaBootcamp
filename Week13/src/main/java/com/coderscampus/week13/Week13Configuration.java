package com.coderscampus.week13;

import com.coderscampus.week13.domain.User;
import com.coderscampus.week13.service.FileService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Week13Configuration {

    // example of a real world type of connecting to a database

    /*@Bean
    public Datsource datsource () {
        Datasource db = new DataSource();
        db.setConnectionString("http://testdomain.test./com:3360");
        db.setUsername("devTest01");

        return db;
    }*/

    @Bean
    public FileService fileService() {
        return new FileService("test.txt");
    }

    @Bean
    public User user () {
        return new User("James.Shep4@gmail.com", "1234", "James S");
    }

}
