package com.coderscampus.week18.hibernateexample.domain;

import javax.persistence.*;

@Entity
@Table(name="accounts")
public class Account {
    private Long accountId;
    private String accountName;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Column(length = 100)
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
