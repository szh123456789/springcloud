package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableCircuitBreaker
public class ProviderServerApplication {

    public static void main(String[] args){
        System.out.println(">>>>>>>>>>>>>>> 启动ProviderServer <<<<<<<<<<<<<<<");
        SpringApplication.run(ProviderServerApplication.class, args);
        System.out.println(">>>>>>>>>>>>>>> 运行ProviderServer成功 <<<<<<<<<<<<<<<");
    }
}