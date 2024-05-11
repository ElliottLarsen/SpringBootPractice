package com.example.MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/greeting")
    public String greeting() {
        return "greetings";
    }
}
