package com.example.restservice.cloudbuskafkademo;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

public class MyRemoteApplicationEvent extends RemoteApplicationEvent {

    private String _message;

    public MyRemoteApplicationEvent() {
    }

    public MyRemoteApplicationEvent(Object source, String originService, String message) {
        super(source, originService);
        _message=message;
    }

    public String getMessage() {
        return _message;
    }

    public MyRemoteApplicationEvent setMessage(String _message) {
        this._message = _message;
        return this;
    }
}
