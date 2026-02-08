package com.hongtayvy.beybladexapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class BaseController {

    @GetMapping("/")
    public java.util.Map<String, Object> root() {
        return java.util.Map.of(
                "status", "ok",
                "swagger", "/swagger-ui/index.html",
                "openapi", "/v3/api-docs",
                "base", "/beybladex"
        );
    }

    // Common bot/probe requests
    @GetMapping({"/favicon.ico", "/robots.txt"})
    public org.springframework.http.ResponseEntity<Void> noContent() {
        return org.springframework.http.ResponseEntity.noContent().build();
    }
}