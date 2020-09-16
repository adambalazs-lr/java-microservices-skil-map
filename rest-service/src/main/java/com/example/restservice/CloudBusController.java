package com.example.restservice;


import com.example.restservice.cloudbuskafkademo.MyRemoteApplicationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudBusController {

    ApplicationContext ctx;

    @Autowired
    public CloudBusController(ApplicationContext ctx) {
        this.ctx=ctx;
    }

    @RequestMapping(value="/publish")
    public String publish() {

        final String ctxId = ctx.getId();
        final MyRemoteApplicationEvent myRemoteApplicationEvent = new MyRemoteApplicationEvent(this, ctxId, "Hello World!");
        ctx.publishEvent(myRemoteApplicationEvent);
        return "Event published succesfully.";
    }
}
