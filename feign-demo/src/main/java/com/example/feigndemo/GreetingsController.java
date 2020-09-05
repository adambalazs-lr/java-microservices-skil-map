package com.example.feigndemo;

import com.example.feigndemo.dto.GreetingsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetingsController {

    private final GreetingsClient client;

    public GreetingsController(GreetingsClient client) {
        this.client = client;
    }

    @GetMapping("/getGreeting")
    public GreetingsResponse getGreeting(){
        return client.getGreetings();
    }
}
