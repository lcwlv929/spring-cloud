/**
 * Copyright (c) 2018,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:spring-ribbon-consumer
 * Package Name:com.lcw.cloud.service
 * File Name:consumerService.java
 * Date:2018年11月6日 上午11:01:36
 * 
 */
package com.lcw.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;
    
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService(){
        return restTemplate.getForEntity("http://EUREKA-SERVICE/hello", String.class).getBody();
    }
    
    public String helloFallback(){
        return "error";
    }
}
