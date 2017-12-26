package com.chinasofti.comsumerFeign.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author yedawang
 * @Date 2017-12-26 11:31
 */
@FeignClient("eureka-client")
public interface DcClient {

//    @RequestMapping(value="/dc",method = RequestMethod.GET)
    @GetMapping("/dc")
    String consumer();
}
