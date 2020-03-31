package com.spring.example.spring.DI.services;

import org.springframework.stereotype.Service;

@Service("constructorGreetingService")
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World - Constructor";
    }
}
