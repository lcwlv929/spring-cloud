/**
 * Copyright (c) 2018,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:spring-api-gateway
 * Package Name:com.lcw.cloud
 * File Name:AccessFilter.java
 * Date:2018年11月7日 上午11:38:32
 * 
 */
package com.lcw.cloud;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;


public class AccessFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(AccessFilter.class);
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info("send {} request to {}",request.getMethod(),request.getRequestURI().toString());
        Object  accessToken = request.getParameter("accessToken");
        if(accessToken == null){
            log.warn("access token is null");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
        log.info("access token ok");
        return null;
    }

    @Override
    public boolean shouldFilter() {
        return true;
        // TODO Auto-generated method stub
    }

    @Override
    public int filterOrder() {
        return 0;
        // TODO Auto-generated method stub
    }

    @Override
    public String filterType() {
        return "pre";
        // TODO Auto-generated method stub
    }

}
