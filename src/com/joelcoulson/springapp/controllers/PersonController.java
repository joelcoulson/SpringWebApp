package com.joelcoulson.springapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {
    @RequestMapping("/")
    public String showHome(Model model) {
        model.addAttribute("name", "Josh");
        model.addAttribute("age", "29");
        return "home";
    }
}