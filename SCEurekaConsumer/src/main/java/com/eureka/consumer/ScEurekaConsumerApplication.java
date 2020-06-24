package com.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class ScEurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScEurekaConsumerApplication.class, args);
    }

    /**
     * 初始化RestTemplate，用来发起REST请求
     * @return
     */
    @Bean
    public RestTemplate rest() {
        return new RestTemplate();
    }

}
