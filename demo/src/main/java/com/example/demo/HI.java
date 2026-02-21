package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HI {

    @GetMapping("/api")
    public String xyz() {
        return "Hey, I am a Software Intern at CodoLog!";
    }
}
