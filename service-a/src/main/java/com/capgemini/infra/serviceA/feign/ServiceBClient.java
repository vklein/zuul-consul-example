package com.capgemini.infra.serviceA.feign;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "service-b")
@Qualifier("ServiceBClientFeign")
public interface ServiceBClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String printServiceB();
}
