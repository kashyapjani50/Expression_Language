package org.example;

import org.springframework.stereotype.Service;

@Service
class MyService {

    private String serviceName;

    public MyService(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }
}
