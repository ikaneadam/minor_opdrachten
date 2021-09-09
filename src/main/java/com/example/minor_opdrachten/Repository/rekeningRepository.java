package com.example.minor_opdrachten.Repository;

import com.example.minor_opdrachten.Model.Rekening;

import java.util.ArrayList;
import java.util.UUID;

public class rekeningRepository {
    private ArrayList<Rekening> rekeningDB = new ArrayList<Rekening>();

    public Rekening getRekening(String id){
        for (Rekening rekening : rekeningDB) {
            if(rekening.getId() == id){
                return rekening;
            }
        }

        return null;
    }

    public ArrayList<Rekening> getRekeningenFromARekeningHouder(String rekeninghouder){
        ArrayList<Rekening> rekeningen = new ArrayList<Rekening>();
        for (Rekening rekening : rekeningDB) {
            for (String rekeninghouders : rekening.getRekeningHouder()) {
                if(rekeninghouders == rekeninghouder){
                    rekeningen.add(rekening);
                }
            }
        }

        return rekeningDB;
    }

    public ArrayList<Rekening> getRekenings(){
        return rekeningDB;
    }

    public void insertRekening(Rekening rekening){
        UUID uuid = UUID.randomUUID();
        rekening.setId(uuid.toString());
        rekeningDB.add(rekening);
    }

    public void updateRekening(String id, Rekening rekening){
        for (int i = 0; i < rekeningDB.size(); i++) {
            if(rekeningDB.get(i).getId() == id){
                rekeningDB.set(i, rekening);
            }
        }
    }

    public void deleteRekening(String id){
        for (int i = 0; i < rekeningDB.size(); i++) {
            if(rekeningDB.get(i).getId() == id){
                rekeningDB.remove(i);
            }
        }
    }

}
