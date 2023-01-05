package com.example.servingwebcontent.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {


    @GetMapping("/")
    public String test() {
        return "minrec";
    }

    @GetMapping("/build")
    public String build() {
        return "build";
    }

    @GetMapping("/photo")
    public String photo() {
        return "photo";
    }

    @GetMapping("/portfolio")
    public String portfolio() {
        return "portfolio";
    }
}