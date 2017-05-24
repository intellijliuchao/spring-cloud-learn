package com.taione.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * FeignApplication!
 * 开启为Feign客户端，集成支持负载均衡、服务间的webservice交互、断路器
 * 开启注册发现客户端
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {
    
    public static void main(String[] args) {
        System.out.println("===== FeignApplication! =====");
        SpringApplication.run(FeignApplication.class, args);
    }
}
