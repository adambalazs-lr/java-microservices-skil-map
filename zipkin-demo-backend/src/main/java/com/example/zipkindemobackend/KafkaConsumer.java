package com.example.zipkindemobackend;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@EnableKafka
public class KafkaConsumer {

    Logger log = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "hello", groupId = "3")
    public void onMessage(ConsumerRecord<String, String> message) {
        log.info("hello " + message.value());
    }

}
