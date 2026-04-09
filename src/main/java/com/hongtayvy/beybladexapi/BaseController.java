package com.hongtayvy.beybladexapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class BaseController {

    @GetMapping("/")
    public String root() {
        return "redirect:/swagger-ui/index.html";
    }

    // Common bot/probe requests
    @GetMapping({"/favicon.ico", "/robots.txt"})
    @ResponseBody
    public org.springframework.http.ResponseEntity<Void> noContent() {
        return org.springframework.http.ResponseEntity.noContent().build();
    }
}