package com.chinasofti.comsumerRibbonHystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yedawang
 * @Date 2017-12-28 10:45
 */
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudComsumerRibbonHystrixApplication {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudComsumerRibbonHystrixApplication.class, args);
    }
}
