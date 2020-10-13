package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/init")
    public String init(Model model) {
    	model.addAttribute("message", "Hello Thymeleaf!!");
        return "hello";
    }
}
