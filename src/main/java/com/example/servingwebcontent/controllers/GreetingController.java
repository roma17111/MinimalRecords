package com.example.servingwebcontent.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
    @GetMapping("/apparatura")
    public String apparatura() {
        return "apparatura";
    }
    @GetMapping("/aboutus")
    public String aboutus() {
        return "aboutus";
    }
}