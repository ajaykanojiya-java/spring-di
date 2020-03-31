package com.spring.example.spring.DI.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// if GreetingService type property/variable in controller class is not annotated with @Qualifer
// in the case where same type of beans (SetterGreetingService, ConstructorGreetingService, PropertyGreetingService) available
//then GreetingServiceImpl dependency will be injected to that property. It happens in MyController class.
@Primary
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World";
    }
}
