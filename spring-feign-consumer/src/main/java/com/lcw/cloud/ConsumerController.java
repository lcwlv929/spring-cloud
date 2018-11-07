/**
 * Copyright (c) 2018,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:spring-feign-consumer
 * Package Name:com.lcw.cloud
 * File Name:ConsumerController.java
 * Date:2018年11月7日 上午9:13:38
 * 
 */
package com.lcw.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/feign-consumer")
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2")
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello("aaa")).append("\n");
        sb.append(helloService.hello("bbb",28)).append("\n");
        sb.append(helloService.hello(new User("ccc",29))).append("\n");
        return sb.toString();
    }
}
