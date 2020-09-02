package com.example.restservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:hi.yml", factory = YamlPropertySourceFactory.class)
public class HiProperties {

    public String defaultName() {
        return name;
    }

    @Value("${hi.name}")
    private String name;

}