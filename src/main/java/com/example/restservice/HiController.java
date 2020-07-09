package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    private static final String template = "O hai, %s!";

    @GetMapping("/greeting")
    public Hi greeting(@RequestParam(value = "name", defaultValue = "Mark") String name) {
        return new Hi(String.format(template, name));
    }
}
