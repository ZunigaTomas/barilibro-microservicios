package com.zunigatomas.barilibro.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-service", r -> r.path("/api/users/**")
                        .uri("lb://user-service"))
                .route("book-service", r -> r.path("/api/books/**")
                        .uri("lb://book-service"))
                .route("purchase-service", r -> r.path("/api/purchases/**")
                        .uri("lb://purchase-service"))
                .build();
    }
}