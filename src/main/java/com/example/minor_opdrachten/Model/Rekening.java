package com.example.minor_opdrachten.Model;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;

public class Rekening {

    private String id;
    @NotNull(message = "Name may not be null")
    private String IBAN;
    @NotNull
    private int Saldo;
    @NotNull
    private ArrayList<String> RekeningHouder;
    @NotNull
    private boolean isBlocked;

    public Rekening(String id, String IBAN, int Saldo, ArrayList<String> RekeningHouder, boolean isBlocked) {
        this.id = id;
        this.IBAN = IBAN;
        this.Saldo = Saldo;
        this.RekeningHouder = RekeningHouder;
        this.isBlocked = isBlocked;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public ArrayList<String> getRekeningHouder() {
        return RekeningHouder;
    }

    public void setRekeningHouder(ArrayList<String> rekeningHouder) {
        RekeningHouder = rekeningHouder;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
