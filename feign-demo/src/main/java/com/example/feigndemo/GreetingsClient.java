package com.example.feigndemo;

import com.example.feigndemo.dto.GreetingsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient(url="http://localhost:8080",name="GREETINGS-CLIENT")
public interface GreetingsClient {

    @GetMapping("/greeting")
    GreetingsResponse getGreetings();

}
