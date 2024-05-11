package com.example.MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("username", "!");
        return "greetings";
    }
}
