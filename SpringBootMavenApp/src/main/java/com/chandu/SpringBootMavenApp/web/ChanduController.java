package com.chandu.SpringBootMavenApp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.SpringBootMavenApp.service.IGreetingService;

@RestController
public class ChanduController {

    private final IGreetingService greetingService;

    public ChanduController(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet")
    public String greet() {
        return greetingService.generateGreeting();
    }
}