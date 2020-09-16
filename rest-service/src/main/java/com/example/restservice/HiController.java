package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
public class HiController {

    final
    KafkaTemplate<String, String> kafkaTemplate;

    private static final String template = "O hai, %s!";

    final
    HiProperties hiProperties;

    @Autowired
    public HiController(HiProperties hiProperties, KafkaTemplate<String, String> kafkaTemplate) {
        this.hiProperties = hiProperties;
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("/greeting")
    public Hi greeting(@RequestParam(value = "name", defaultValue = "Mark") String name) {
        return new Hi(String.format(template, name));
    }

    @GetMapping("/configured")
    public Hi greeting() {
        return new Hi(String.format(template, hiProperties.defaultName()));
    }

    @GetMapping("/foo")
    public Hi foo() {
        return new Hi(String.format(template, foo));
    }

    @GetMapping("/zipkintest")
    public CompletableFuture<String> callBackend() {
        String messageId = UUID.randomUUID().toString();
        return kafkaTemplate.send("hello", messageId)
                .completable()
                .thenApply(r -> "sent " + messageId);
    }

    @Value("${foo}")
    private String foo;


    @RequestMapping("/")
    public String ribbonPing() {
        return port.toString();
    }


    @Value("${server.port}")
    private Integer port;


}
