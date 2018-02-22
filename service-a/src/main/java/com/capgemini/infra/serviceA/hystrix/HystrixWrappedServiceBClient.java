package com.capgemini.infra.serviceA.hystrix;

import com.capgemini.infra.serviceA.feign.ServiceBClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HystrixWrappedServiceBClient implements ServiceBClient {

    @Qualifier("ServiceBClientFeign")
    @Autowired
    private ServiceBClient serviceBClient;

    @Override
    @HystrixCommand(groupKey = "helloGroup", fallbackMethod = "fallBackCall")
    public String printServiceB() {
        return serviceBClient.printServiceB();
    }

    public String fallBackCall() {
        return "FAILED SERVICE B CALL! - FALLING BACK";
    }
}
