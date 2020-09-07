package com.example.restservice;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("")
public class CloudConfigPropertiesConfigurationProperties {

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getFoo() {
        return foo;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    private String foo;

    private String hello;

}
