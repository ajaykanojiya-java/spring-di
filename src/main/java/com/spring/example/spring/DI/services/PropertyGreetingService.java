package com.spring.example.spring.DI.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World - Property";
    }
}
