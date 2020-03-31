package com.spring.example.spring.DI.controllers;

import com.spring.example.spring.DI.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    GreetingService greetingService;

    @Autowired //setter based DI
    //@Qualifier is used to resolve run time dependency injection. Here SetterGreetingService object will be injected
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreetings(){
        return greetingService.sayGreetings();
    }
}
