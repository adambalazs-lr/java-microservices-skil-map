package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    private static final String template = "O hai, %s!";

    final
    HiProperties hiProperties;

    @Autowired
    public HiController(HiProperties hiProperties) {
        this.hiProperties = hiProperties;
    }

    @GetMapping("/greeting")
    public Hi greeting(@RequestParam(value = "name", defaultValue = "Mark") String name) {
        return new Hi(String.format(template, name));
    }

    @GetMapping("/configured")
    public Hi greeting() {
        return new Hi(String.format(template,  hiProperties.defaultName()));
    }
}
