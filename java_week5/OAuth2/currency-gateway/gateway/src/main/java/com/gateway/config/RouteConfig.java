package com.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator currencyRouteConfig(RouteLocatorBuilder
                                                   routeLocatorBuilder){
        return routeLocatorBuilder.routes().route(p->p.path("/currencycon/**")
                        .filters(f->f.rewritePath("/currencycon/(?<segment>.*)","/${segment}")
                                .circuitBreaker(config->config.setName("currencyCircuitBreaker")
                                        .setFallbackUri("forward:/fallback"))
                                .addRequestHeader("timeStamp", LocalDateTime.now().toString()))
                        .uri("lb://currency-conversion"))
                .route(p->p.path("/currencyex/**")
                        .filters(f->f.rewritePath("/currencyex/(?<segment>.*)","/${segment}")
                                .circuitBreaker(config->config.setName("currencyCircuitBreaker")
                                        .setFallbackUri("forward:/fallback"))
                                .addRequestHeader("timeStamp",LocalDateTime.now().toString()))

                        .uri("lb://currency-exchange")).build();

    }
    }



