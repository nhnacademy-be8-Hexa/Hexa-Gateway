package com.nhnacademy.hexagateway.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator msRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("ms1", r -> r.path("/ms1/**").uri("lb://eurekaClient1"))
                .route("ms2", r -> r.path("/ms2/**").uri("lb://eurekaClient2"))
                .build();
    }
}
