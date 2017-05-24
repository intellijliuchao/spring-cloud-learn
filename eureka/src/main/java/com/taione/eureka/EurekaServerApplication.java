package com.taione.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServer!
 * 注册发现服务
 * 开启为注册发现服务器
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String[] args) {
        System.out.println("===== EurekaServerApplication! =====");
        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
    }
}
