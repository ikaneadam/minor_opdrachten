package com.example.minor_opdrachten.Repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class opdracht1Repository {
    private HashMap<Integer, String> MemoryDB = new HashMap<Integer, String>();

    public opdracht1Repository(){
        //test
        this.MemoryDB.put(4, "hello world");
    }

    public int getAmountofWordsFromStoredText(String text){
        for (Map.Entry<Integer,String> storedText : MemoryDB.entrySet()){
            System.out.println("yo");
            if((storedText.getValue()).equals(text)){
                return storedText.getKey();
            }
        }
        return 0;
    }

    public boolean isTextStored(String text){
        for (Map.Entry<Integer,String> storedText : MemoryDB.entrySet()){
            if((storedText.getValue()).equals(text)){
                return true;
            }
        }
        return false;
    }

    public void insertTextAndAmount(Integer amount, String text){
        MemoryDB.put(amount, text);
    }
}
