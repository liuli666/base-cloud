package com.cloud.micro;

import com.cloud.micro.com.micro.url.URL;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/*
 * 制定映射的服务的映射[Application]
 */
@FeignClient(value = "MICRO-SERVICE")
public interface ServiceControlApi {
    /**
     * api中映射对应service下的方法
     * @param id
     * @return
     */
    @RequestMapping(value = URL.MICRO_SERVICE_SERVICECONTROLLER_GETINFO ,method = RequestMethod.GET)
    public Map<String ,Object> getInfo(@PathVariable("id") Long id);
}
