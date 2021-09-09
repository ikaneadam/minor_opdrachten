package com.example.minor_opdrachten.service;

import com.example.minor_opdrachten.Model.Rekening;
import com.example.minor_opdrachten.Repository.rekeningRepository;
import com.example.minor_opdrachten.controller.rekeningController;

import java.util.ArrayList;

public class rekeningService {
private rekeningRepository rekeningRepository;

    public rekeningService(){
        this.rekeningRepository = new rekeningRepository();
    }

    public Rekening getRekening(String id){
        return this.rekeningRepository.getRekening(id);
    }

    public ArrayList<Rekening> getRekeningenFromARekeningHouder(String rekeninghouder){
        return this.rekeningRepository.getRekeningenFromARekeningHouder(rekeninghouder);
    }

    public ArrayList<Rekening> getRekenings(){
        return this.rekeningRepository.getRekenings();
    }

    public void insertRekening(Rekening rekening){
        this.rekeningRepository.insertRekening(rekening);
    }

    public void updateRekening(String id, Rekening rekening){
        this.rekeningRepository.updateRekening(id, rekening);
    }

    public void deleteRekening(String id){
        this.rekeningRepository.deleteRekening(id);
    }

}
