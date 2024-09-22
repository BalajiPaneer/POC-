/*
package com.dev.ApiGateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator customRoute(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes()
                //.route("CONFIGSERVER", r-> r.path("/api/**").uri("http://localhost:8888"))
                .route("Delivery", r-> r.path("/api/**").uri("lb://DELIVERY"))
                .route("SALES", r-> r.path("/api1/**").uri("lb://SALES"))
                .build();
    }
}
*/
