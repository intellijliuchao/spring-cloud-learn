package com.taione.get_config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * GetConfigApplication!
 */
@SpringBootApplication
public class GetConfigApplication {
    
    public static void main(String[] args) {
        System.out.println("===== GetConfigApplication! =====");
        new SpringApplicationBuilder(GetConfigApplication.class).web(true).run(args);
    }
}
