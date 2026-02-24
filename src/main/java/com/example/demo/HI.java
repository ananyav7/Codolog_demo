package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HI {

    @GetMapping("/api")
    List<DTO_Mode> abc(){
        List<DTO_Mode> modes= new ArrayList<>();

        DTO_Mode dt= new DTO_Mode();

        dt.setId(20);
        dt.setIsActive("TRUE");
        dt.setStart_time("12-02-2027");
        dt.setEnd_time("13-02-2026");

        modes.add(dt);

        return modes;
    }
}
