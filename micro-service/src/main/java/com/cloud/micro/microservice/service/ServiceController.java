package com.cloud.micro.microservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ServiceController {
    Logger logger = LoggerFactory.getLogger(ServiceController.class);
    @RequestMapping(value = "/service/index/{id}" ,method = RequestMethod.GET)
    public Map<String ,Object> getInfo(@PathVariable("id") Long id) {
        logger.info("micro-service获取到请求，请求ID为:{}" ,id);
        Map<String ,Object> resMap =new HashMap<String ,Object>();
        resMap.put("res" ,"请求到了micro-service的结果");
        return resMap;
    }
}
