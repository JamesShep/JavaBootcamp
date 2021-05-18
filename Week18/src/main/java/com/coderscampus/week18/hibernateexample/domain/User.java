package com.coderscampus.week18.hibernateexample.domain;

import javax.persistence.*;

@Entity // Class name = User, DB table name = user
@Table(name = "users")
public class User {

    private String username;
    private String password;
    private String name;
    private Long userId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getUserId() {
        return userId;
    }
}
