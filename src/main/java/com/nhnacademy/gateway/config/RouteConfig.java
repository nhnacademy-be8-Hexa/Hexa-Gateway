package com.nhnacademy.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator msRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("ms1", r -> r.path("/api/auth/login")
                        .uri("lb://HEXA-JWT-AUTH-SERVICE")
                )
                .route("ms2", r -> r.path("/api/**")
                        .uri("lb://HEXA-SHOPPINGMALL-SERVICE")
                )
                .build();
    }
}
