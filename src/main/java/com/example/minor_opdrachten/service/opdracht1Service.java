package com.example.minor_opdrachten.service;

public class opdracht1Service {

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
}
