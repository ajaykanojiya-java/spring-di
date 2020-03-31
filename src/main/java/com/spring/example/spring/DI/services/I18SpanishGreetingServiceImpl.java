package com.spring.example.spring.DI.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18Service")
public class I18SpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Helo Mundo - ES";
    }
}
