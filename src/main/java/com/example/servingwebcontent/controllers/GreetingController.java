package com.example.servingwebcontent.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("name", " Roman");
        return "greeting";
    }
    @GetMapping("/test")
    public String start(Model model) {
        return "greeting";
    }
    @GetMapping("/start")
    public String test() {
        return "minrec";
    }


}