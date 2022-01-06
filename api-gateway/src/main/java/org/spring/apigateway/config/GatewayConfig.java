package org.spring.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder){
        return builder.routes()
            .route(p -> p.path("/get")
                .filters(f -> f.addRequestHeader("headerName", "headerValue")
                    .addRequestParameter("param", "value"))
                .uri("http://httpbin.org:80"))
            .route(p -> p.path("/cars/**").uri("lb://cars-microservice"))
            .route(p -> p.path("/users/**").uri("lb://user-microservice"))
            .route(p -> p.path("/cars/**")
                .filters(f -> f
                    .rewritePath("/cars/(?<segment>.*)", "/cars-microservice/${segment}"))
                    .uri("lb://cars-microservice"))
            .build();
    }
}