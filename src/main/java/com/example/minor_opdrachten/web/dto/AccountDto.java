package com.example.minor_opdrachten.web.dto;


import javax.validation.constraints.*;
import java.util.UUID;

public class AccountDto {
    private UUID id;
    @NotNull(message = "saldo may not be empty")
    private Integer saldo;
    @NotNull(message = "status may not be empty")
    private boolean status;
    private String iban;


    public AccountDto(UUID id, int saldo, boolean status, String iban) {
        this.id = id;
        this.saldo = saldo;
        this.status = status;
        this.iban = iban;
    }

    public AccountDto() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}

