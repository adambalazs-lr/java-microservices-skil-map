package com.example.feigndemo;

import com.example.feigndemo.dto.GreetingsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class GreetingsController {

    private final GreetingsClient client;

    public GreetingsController(GreetingsClient client, RestTemplate restTemplate) {
        this.client = client;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getGreetingFeign")
    public GreetingsResponse getGreetingFeign(){
        return client.getGreetings();
    }

    @GetMapping("/getGreetingRestTemplate")
    public GreetingsResponse getGreetingRestTemplate(){
        String uri = "http://localhost:8080/greeting?name=You";
        GreetingsResponse forObject = restTemplate.getForObject(uri, GreetingsResponse.class);
        return forObject;
    }

    final RestTemplate restTemplate;
}
