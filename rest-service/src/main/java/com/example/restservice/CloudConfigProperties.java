package com.example.restservice;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@EnableConfigurationProperties(CloudConfigPropertiesConfigurationProperties.class)
public class CloudConfigProperties {
    private CloudConfigPropertiesConfigurationProperties cpcp;

    public CloudConfigProperties(CloudConfigPropertiesConfigurationProperties cpcp) {
        this.cpcp = cpcp;
    }

    @Profile("dev")
    @Bean
    public String devDBCcnnection() {
        System.out.println("DB Connection for Dev");
        System.out.println(cpcp.getFoo());
        System.out.println(cpcp.getHello());
        return "DB Connection for Dev";
    }

    @Profile("qa")
    @Bean
    public String qaDBCcnnection() {
        System.out.println("DB Connection for qa");
        System.out.println(cpcp.getFoo());
        System.out.println(cpcp.getHello());
        return "DB Connection for qa";
    }

    @Profile("prod")
    @Bean
    public String prodDBCcnnection() {
        System.out.println("DB Connection for prod");
        System.out.println(cpcp.getFoo());
        System.out.println(cpcp.getHello());
        return "DB Connection for prod";
    }


}
