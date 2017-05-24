package com.taione.compute;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ComputeServiceApplication!
 * 微服务实例
 * 注册为注册发现客户端
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplication {
    
    public static void main(String[] args) {
        System.out.println("===== ComputeServiceApplication! =====");
        new SpringApplicationBuilder(ComputeServiceApplication.class).web(true).run(args);
    }
}
