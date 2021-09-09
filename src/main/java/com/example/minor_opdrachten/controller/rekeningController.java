package com.example.minor_opdrachten.controller;

import com.example.minor_opdrachten.Model.Rekening;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rekening")
public class rekeningController {
    private rekeningController rekeningController;

    public rekeningController(){
        this.rekeningController = new rekeningController();
    }


    @GetMapping("{string}")
    public ResponseEntity<Rekening> getRekening(@PathVariable String string){
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @GetMapping()
    public String getRekenings(@PathVariable String string){
        return "yo";
    }




}
