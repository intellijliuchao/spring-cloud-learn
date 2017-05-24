package com.taione.zuul_gateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * ZuulProxyApplication!
 * SpringCloudApplication注解整合了@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker
 * 开启服务网关
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZuulProxyApplication {
    
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
    
    public static void main(String[] args) {
        System.out.println("===== ZuulProxyApplication! =====");
        new SpringApplicationBuilder(ZuulProxyApplication.class).web(true).run(args);
    }
}
