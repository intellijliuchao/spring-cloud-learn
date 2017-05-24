package com.liuchao.springboot;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liuchao.springboot.mapper.AdsMapper;
import com.liuchao.springboot.mapper.model.AdsEntity;

@RestController
@SpringBootApplication
@ConfigurationProperties(prefix="liuchao")
public class Application {

    private String name;
    private List<String> testarray = new ArrayList<>();
    @Autowired
    private AdsMapper adsMapper;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTestarray() {
        return testarray;
    }

    public void setTestarray(List<String> testarray) {
        this.testarray = testarray;
    }

    @RequestMapping("/")
    String home() {
        return "Hello World spring boot!";
    }

    @RequestMapping("/now")
    String hehe() {
        for (String string : testarray) {
            System.out.println(string);
        }
        AdsEntity ads = adsMapper.findById(1L);
        System.out.println(ads.toString());
        return "spring boot:现在时间：" + new Date() + "=====" + name + "<br/>" + ads.toString();
    }
    
    public static void main(String[] args) {
        // 第一种启动方式
        ConfigurableApplicationContext cac = SpringApplication.run(Application.class, args);
        // 第二种启动方式
//        SpringApplication application = new SpringApplication(Application.class);
//        application.run(args);
        // 第三种启动方式
//        new SpringApplicationBuilder()
//        .showBanner(false)
//        .sources(Application.class)
//        .run(args);
    }

}
