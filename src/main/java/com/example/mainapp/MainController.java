package com.example.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String home() {
        return "Project 2 is running!";
    }

    public void printStatus() {
        System.out.println("Hello Student!");
    }
}