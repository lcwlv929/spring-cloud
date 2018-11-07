/**
 * Copyright (c) 2018,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:spring-ribbon-consumer
 * Package Name:com.lcw.cloud.controller
 * File Name:ConsumerController.java
 * Date:2018年11月5日 上午10:34:25
 * 
 */
package com.lcw.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lcw.cloud.service.ConsumerService;

/**
 * ClassName: ConsumerController <br/>
 * Description: ribbin <br/>
 * <br/>
 * 
 */

@RestController
public class ConsumerController {
//  -----hystrix调用方式开始
    @Autowired
    ConsumerService consumerService;
    
    @RequestMapping(value="/ribbin-consumer")
  public String helloConsumer(){
      return consumerService.helloService();
  }
//  -----hystrix调用方式结束
//  -----直接调用方式开始
//    @Autowired
//    RestTemplate restTemplate;
//    
//    @RequestMapping(value="/ribbin-consumer")
//    public String helloConsumer(){
//        return restTemplate.getForEntity("http://EUREKA-SERVICE/hello", String.class).getBody();
//    }
//  -----直接调用方式结束
}
