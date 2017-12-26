package com.chinasofti.comsumerFeign.controller;

import com.chinasofti.comsumerFeign.feign.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yedawang
 * @Date 2017-12-26 11:32
 */
@RestController
public class DcController {
    @Autowired
    private DcClient dcClient ;

    @GetMapping("/consumer")
    public String dc() {
        System.out.println("dc....start");
        return dcClient.consumer();
    }
}
