package com.nhnacademy.hexagateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@Slf4j
public class HexaGatewayApplication {

    public static void main(String[] args) {
        log.info("Spring Boot Application Started");
        SpringApplication.run(HexaGatewayApplication.class, args);

    }

}
