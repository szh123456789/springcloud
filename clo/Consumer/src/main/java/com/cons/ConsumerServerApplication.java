package com.cons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class ConsumerServerApplication {

    public static void main(String[] args){
        System.out.println(">>>>>>>>>>>>>>> 启动ConsumerServer <<<<<<<<<<<<<<<");
        SpringApplication.run(ConsumerServerApplication.class, args);
        System.out.println(">>>>>>>>>>>>>>> 运行ConsumerServer成功 <<<<<<<<<<<<<<<");
    }
}
