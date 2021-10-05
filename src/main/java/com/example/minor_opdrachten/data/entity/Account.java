package com.example.minor_opdrachten.data.entity;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Account {
    @Id
    @Type(type = "uuid-char")
    @GeneratedValue
    private UUID id;
    private String iban;
    private int saldo;
    private boolean status = true;

    public Account(UUID id, String iban, int saldo, boolean status) {
        this.id = id;
        this.iban = iban;
        this.saldo = saldo;
        this.status = status;
    }

    public Account() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
