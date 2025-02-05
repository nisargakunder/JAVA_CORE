package com.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GatewayController {
    @GetMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("Service is currently unavailable. Please try again later.");
    }
}
