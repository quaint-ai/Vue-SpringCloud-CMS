package com.hist.js;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@EnableFeignClients
@ComponentScan(basePackages = "com.hist.js.*")
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class);
    }
}
