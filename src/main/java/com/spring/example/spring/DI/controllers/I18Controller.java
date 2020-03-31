package com.spring.example.spring.DI.controllers;

import com.spring.example.spring.DI.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18Controller {
    GreetingService greetingService;

    public I18Controller(@Qualifier("i18Service") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGetGreetings(){
        return greetingService.sayGreetings();
    }
}
