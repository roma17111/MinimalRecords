package com.example.servingwebcontent.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AboutUs {

    @GetMapping("/aboutus/#1")
    public String us1() {
        return "aboutus";
    }
}
