package com.example.minor_opdrachten.service;

import com.example.minor_opdrachten.Repository.opdracht1Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class opdracht1Service {
    private opdracht1Repository opdracht1Repository = new opdracht1Repository();
    Logger logger = LoggerFactory.getLogger(opdracht1Service.class);

    public String reverseString(String string){
        char[] characterList = string.toCharArray();
        String reverseString = "";

        for(int i = characterList.length - 1; i >= 0; i--){
            reverseString += characterList[i];
        }
        return reverseString;
    }

    public int getAmountOfWords(String string){
        if (string == null || string.isEmpty()) {
            return 0;
        }

        String[] listOfWords = string.split("\\s+");
        return listOfWords.length;
    }


    public int postAmountOfwords(String text){
        if(opdracht1Repository.isTextStored(text)){
            return opdracht1Repository.getAmountofWordsFromStoredText(text);
        }

        int amountOfWords = getAmountOfWords(text);
        opdracht1Repository.insertTextAndAmount(amountOfWords, text);
        return amountOfWords;
    }
}
