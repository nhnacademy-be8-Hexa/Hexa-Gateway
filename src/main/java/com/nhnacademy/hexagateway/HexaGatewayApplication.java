package com.nhnacademy.hexagateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HexaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HexaGatewayApplication.class, args);

    }

}
