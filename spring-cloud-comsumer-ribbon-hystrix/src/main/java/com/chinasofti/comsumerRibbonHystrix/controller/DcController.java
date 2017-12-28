package com.chinasofti.comsumerRibbonHystrix.controller;

import com.chinasofti.comsumerRibbonHystrix.service.ComsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yedawang
 * @Date 2017-12-26 10:55
 */
@RestController
public class DcController {
    private RestTemplate restTemplate;

    @Autowired
    private ComsumerService comsumerService ;

    @GetMapping("/consumer")
    public String dc() {

        return comsumerService.consumer();
    }
}
