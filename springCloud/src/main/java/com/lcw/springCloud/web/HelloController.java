/**
 * Copyright (c) 2018,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:springCloud
 * Package Name:com.lcw.springCloud
 * File Name:HelloController.java
 * Date:2018年11月1日 下午4:09:52
 * 
 */
package com.lcw.springCloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lcw.springCloud.entity.User;

@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/hello")
    public String index() {
        ServiceInstance instance = client.getLocalServiceInstance();
        System.out.println("/hello,host:" + instance.getHost() + "service_id:" + instance.getServiceId());
        return "无参数Hello";
    }

    @RequestMapping(value = "hello1")
    public String hello(@RequestParam String name) {
        return "参数名称：" + name;
    }

    @RequestMapping(value = "hello2")
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @RequestMapping(value = "hello3")
    public String hello(@RequestBody User user) {
        return "对象名称：" + user.getName() + "," + user.getAge();
    }

}