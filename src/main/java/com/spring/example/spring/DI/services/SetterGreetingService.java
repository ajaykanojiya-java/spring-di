package com.spring.example.spring.DI.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingService")
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World - Setter";
    }
}
