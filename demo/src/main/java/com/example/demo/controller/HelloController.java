package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/init")
    public String init(Model model) {
    	model.addAttribute("message", "Hello Thymeleaf!!");
        return "hello";
    }
    
    @GetMapping("/second")
    public String second(Model model) {
    	model.addAttribute("message", "Hello second!!");
        return "second";
    }
}
