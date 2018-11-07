/**
 * Copyright (c) 2018,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:springCloud
 * Package Name:com.lcw.cloud.web
 * File Name:HelloControllerTests.java
 * Date:2018年11月1日 下午4:16:46
 * 
 */
package com.lcw.springCloud.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;



//@RunWith(SpringRunner.class)
//@SpringBootTest
public class HelloControllerTests {

//    @Autowired
//    private WebApplicationContext context;
//    private MockMvc mvc;
//
//    @Before
//    public void setupMockMvc() throws Exception {
//        mvc = MockMvcBuilders.webAppContextSetup(context).build();
//    }
//    
//    @Test
//    public void hello() throws Exception{
//        mvc.perform(post("/hello") // //调用接口
////                .contentType(MediaType.APPLICATION_JSON_UTF8)
////                .param("userId", "11").param("userName", "henry")//传入添加的用户参数 
//                .accept(MediaType.APPLICATION_JSON))  //接收的类型
//                .andExpect(status().isOk())   //判断接收到的状态是否是200
//                .andDo(print());  //打印内容
////                .andExpect((ResultMatcher) content().contentType(MediaType.APPLICATION_JSON_UTF8)).andExpect((ResultMatcher) content().string(Matchers.contains("OK"))) //匹配返回值中的内容
////                .andExpect((ResultMatcher) jsonPath("$.errcode", is(0)));////使用jsonPath解析返回值，判断具体的内容 
//
//    }

}
