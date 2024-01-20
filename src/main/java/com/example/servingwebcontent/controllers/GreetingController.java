package com.example.servingwebcontent.controllers;


import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class GreetingController {


    @GetMapping("/")
    public String test(Model model) {
        String date = String.valueOf(String.format("©%s Все права защищены",LocalDate.now().getYear()));
        model.addAttribute("date", date);
        return "minrec";
    }

    @GetMapping("/build")
    public String build(Model model) {
        String date = String.valueOf(String.format("©%s Все права защищены",LocalDate.now().getYear()));
        model.addAttribute("date", date);
        return "build";
    }

    @GetMapping("/photo")
    public String photo(Model model) {
        String date = String.valueOf(String.format("©%s Все права защищены",LocalDate.now().getYear()));
        model.addAttribute("date", date);
        return "photo";
    }

    @GetMapping("/portfolio")
    public String portfolio(Model model) {
        String date = String.valueOf(String.format("©%s Все права защищены",LocalDate.now().getYear()));
        model.addAttribute("date", date);
        return "portfolio";
    }
    @GetMapping("/apparatura")
    public String apparatura(Model model) {
        String date = String.valueOf(String.format("©%s Все права защищены",LocalDate.now().getYear()));
        model.addAttribute("date", date);
        return "apparatura";
    }
    @GetMapping("/aboutus")
    public String aboutus(Model model) {
        String date = String.valueOf(String.format("©%s Все права защищены",LocalDate.now().getYear()));
        model.addAttribute("date", date);
        return "aboutus";
    }
}