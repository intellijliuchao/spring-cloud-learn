package com.taione.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ConsumerController!
 */
@RestController
public class ConsumerController {
    
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private ComputeService computeService;
    
    @RequestMapping(value = "/add_old", method = RequestMethod.GET)
    public String add_old() {
        // 负载均衡方式调用注册服务接口
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=10&b=20", String.class).getBody();
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return computeService.addService();
    }
}
