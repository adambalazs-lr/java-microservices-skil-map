package com.example.ribbondemo;

import com.netflix.client.IClient;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class RibbonConfiguration {

    @Autowired
    IClientConfig ribbonClient;

    @Bean
    public IPing ping(IClientConfig ribbonClient) {
        return new PingUrl();
    }

    @Bean
    public IRule rule(IClientConfig ribbonClient) {
        return new AvailabilityFilteringRule();
    }

    @Bean
    RestTemplate template() {
        return new RestTemplate();
    }
}
