package com.ctseducare.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutesConfig {

  @Bean
  public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
    return builder.routes()
        .route(r -> r.path("/employee/**").uri("lb://EMPLOYEE-SERVICE"))
        .route(r -> r.path("/payroll/**").uri("lb://PAYROLL-SERVICE"))
        .build();
  }

}