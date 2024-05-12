package com.example.CRUD.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    String username = "John Doe";
    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("username", username);
        return "greetings";
    }

    @GetMapping("/goodbye")
    public String farewell(Model model) {
        model.addAttribute("username", username);
        return "farewell";
    }
}
