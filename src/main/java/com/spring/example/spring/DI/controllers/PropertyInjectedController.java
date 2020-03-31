package com.spring.example.spring.DI.controllers;

import com.spring.example.spring.DI.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyGreetingService")
    GreetingService greetingService;

    public String getGreetings(){
        return greetingService.sayGreetings();
    }
}
