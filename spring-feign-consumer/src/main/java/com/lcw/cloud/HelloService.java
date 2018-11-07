/**
 * Copyright (c) 2018,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:spring-feign-consumer
 * Package Name:com.lcw.cloud
 * File Name:HelloService.java
 * Date:2018年11月7日 上午9:10:37
 * 
 */
package com.lcw.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("EUREKA-SERVICE")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping("/hello1")
    String hello(@RequestParam("name") String name);

    @RequestMapping("/hello2")
    String hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping("/hello3")
    String hello(@RequestBody User user);
}
