package com.coderscampus.week13.config;

import com.coderscampus.week13.domain.User;
import com.coderscampus.week13.service.FileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("qa")
public class Week13QaConfiguration {

    // example of a real world type of connecting to a database

    /*@Bean
    public Datsource datsource () {
        Datasource db = new DataSource();
        db.setConnectionString("http://testdomain.test./com:3360");
        db.setUsername("devTest01");

        return db;
    }*/

    @Value("${superuser.username}")
    private String username;

    @Value("${superuser.password}")
    private String password;

    @Value("${superuser.name}")
    private String name;

    @Bean
    public FileService fileService() {
        return new FileService("test.txt");
    }

    @Bean
    public User user () {
        return new User(username, password, name);
    }

}
