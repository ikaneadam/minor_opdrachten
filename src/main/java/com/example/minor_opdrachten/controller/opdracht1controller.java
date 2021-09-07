package com.example.minor_opdrachten.controller;

import com.example.minor_opdrachten.service.opdracht1Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("opdracht1")
public class opdracht1controller {
    private opdracht1Service opdracht1Service = new opdracht1Service();


    @GetMapping("/reverse/{string}")
    public String getReverseString(@PathVariable String string){
        return opdracht1Service.reverseString(string);
    }

    @GetMapping("/amount/{string}")
    public int getAmountOfWords(@PathVariable String string){
        return opdracht1Service.postAmountOfwords(string);
    }
}
