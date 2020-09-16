package com.example.restservice.cloudbuskafkademo;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class MyRemoteApplicationEventListener implements ApplicationListener<MyRemoteApplicationEvent> {

    Logger log = LoggerFactory.getLogger(MyRemoteApplicationEventListener.class);

    @Override
    public void onApplicationEvent(MyRemoteApplicationEvent event) {
        log.info(" *** message from kafka through cloud bus reveiced: " + event.getMessage());
    }
}
