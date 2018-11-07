/**
 * Copyright (c) 2018,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:springCloud
 * Package Name:com.lcw.springCloud.web
 * File Name:HelloController2Tests.java
 * Date:2018年11月2日 上午9:28:45
 * 
 */
package com.lcw.springCloud.web;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import mockit.Expectations;
import mockit.Mocked;

public class HelloController2Tests {

//    @InjectMocks
//    private HelloController loginController;
////
////    @Mock
////    private LoginService loginService;
//
//    private MockMvc mockMvc;
//
//    @Before
//    public void setUp() throws Exception {
//        MockitoAnnotations.initMocks(this);
//        this.mockMvc = MockMvcBuilders.standaloneSetup(loginController).build();
//    }
//
//    @Test
//    public void testLogin() throws Exception {
//
////        when(loginService.login()).thenReturn(false);
//        this.mockMvc.perform(get("/hello"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().string("Hello"));
////                .andExpect(view().name("Hello"))
////                .andReturn();
//    }
}
