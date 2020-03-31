package com.spring.example.spring.DI.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18Service")
public class I18EnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hello World - EN";
    }
}
