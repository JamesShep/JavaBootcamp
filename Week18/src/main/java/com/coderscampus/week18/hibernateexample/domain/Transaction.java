package com.coderscampus.week18.hibernateexample.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction {

    private Long transactionID;
    private LocalDateTime transactionDate;
    private Double amount;
    private String type;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Column(length = 1)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
