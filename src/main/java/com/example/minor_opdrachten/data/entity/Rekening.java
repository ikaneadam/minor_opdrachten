package com.example.minor_opdrachten.data.entity;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Rekening")
public class Rekening {
    @Id
    @Type(type = "uuid-char")
    @GeneratedValue
    private UUID id;
    @Column(name = "iban")
    private String IBAN;
    @Column(name = "saldo")
    private int Saldo;
    @Column(name = "rekeninghouder")
    private String RekeningHouder;
    @Column(name = "isBlocked")
    private boolean isBlocked;

    public Rekening( String IBAN, int Saldo, String RekeningHouder, boolean isBlocked) {

        this.IBAN = IBAN;
        this.Saldo = Saldo;
        this.RekeningHouder = RekeningHouder;
        this.isBlocked = isBlocked;
    }

    public Rekening() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int saldo) {
        Saldo = saldo;
    }

    public String getRekeningHouder() {
        return RekeningHouder;
    }

    public void setRekeningHouder(String rekeningHouder) {
        RekeningHouder = rekeningHouder;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
