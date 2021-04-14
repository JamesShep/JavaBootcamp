package com.coderscampus.week13.config;

import com.coderscampus.week13.domain.User;
import com.coderscampus.week13.service.FileService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class Week13DevConfiguration {

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
    public User superUser () {
        return new User("JamesTest@gmail.com", "1234", "James S");
    }

    @Bean
    public User regularUser () {
        return new User("regular@gmail.com", "4321", "Joe Blo");
    }

}
