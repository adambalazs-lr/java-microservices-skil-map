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

    //TODO: ask why am I cannot to retrive rest-service-prod.yaml, why this
    // **** falling back to rest-service.yaml. This looking suspicious:
    // 2020-09-05 14:24:52.576  INFO 24660 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Fetching config from server at : http://localhost:8888
    // 2020-09-05 14:24:53.610  INFO 24660 --- [           main] c.c.c.ConfigServicePropertySourceLocator : Located environment: name=rest-service, profiles=[default], label=null, version=24fb26d7a95ea38f25840344229f83a4859b0a83, state=null
    // 2020-09-05 14:24:53.610  INFO 24660 --- [           main] b.c.PropertySourceBootstrapConfiguration : Located property source: [BootstrapPropertySource {name='bootstrapProperties-configClient'}, BootstrapPropertySource {name='bootstrapProperties-https://github.com/adambalazs-lr/spring-boot-config-demo.git/application.properties'}]
    // I tried many solutions with no avail yet.
    private String foo;

    private String hello;

}
