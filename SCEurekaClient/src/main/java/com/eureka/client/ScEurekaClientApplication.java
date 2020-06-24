package com.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient  //服务提供方，客户端
@SpringBootApplication
public class ScEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScEurekaClientApplication.class, args);
    }

}
