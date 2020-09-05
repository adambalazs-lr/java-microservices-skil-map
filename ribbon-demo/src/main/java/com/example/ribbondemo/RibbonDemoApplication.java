package com.example.ribbondemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@SpringBootApplication
@RestController
@RibbonClient(name = "greeter", configuration = RibbonConfiguration.class)
public class RibbonDemoApplication {

    @Autowired
    private RestTemplate template;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/invoke")
    public String invokeGreeter() {
        ServiceInstance instance = loadBalancerClient.choose("greeter");
        URI uri = URI.create(String.format("http://%s:%s/greeting",
                instance.getHost(), instance.getPort()));
        return template.getForObject(uri, String.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(RibbonDemoApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate loadBalanced() {
        return new RestTemplate();
    }

    // After Hours of spiraling into madness I found (randomly) this chinese
    // baidu page with the solution with really broken auto-hungarian
    // translation: https://www.cnblogs.com/chenglc/p/10046055.html
    // I have ZERO idea why this works now. What I know @Primary isn't mentioned
    // on the skill-map's guide https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-ribbon.html ever...

    @Bean
    @Primary
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
