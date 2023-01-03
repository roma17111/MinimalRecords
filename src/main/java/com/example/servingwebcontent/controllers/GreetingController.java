package com.example.servingwebcontent.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {


    @GetMapping("/")
    public String start(Model model) {
        return "minrec";
    }
    @GetMapping("home")
    public String test() {
        return "minrec";
    }


}