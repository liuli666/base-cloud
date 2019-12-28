package com.cloud.micro.microservice.service;

import com.cloud.micro.ServiceControlApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WebController {
    Logger logger = LoggerFactory.getLogger(WebController.class);
    @Autowired
    private ServiceControlApi serviceControlApi;

    @RequestMapping(value = "/web/index/{id}" ,method = RequestMethod.GET)
    public Map<String ,Object> getInfo(@PathVariable("id") Long id) {
        logger.info("micro-web接收到请求，请求ID为:{}" ,id);
        Map<String, Object> info = serviceControlApi.getInfo(id);
        logger.info("获取到调用服务的返回结果值:{}" ,info);
        return info;
    }
}
