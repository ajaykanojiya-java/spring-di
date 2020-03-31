package com.spring.example.spring.DI.config;

import com.spring.example.spring.DI.examplebeans.FakeDataSource;
import com.spring.example.spring.DI.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath:datasource.properties")
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    //below bean can be used to access env variable set in OS.
    //USERNAME var has been set with below value while edit configuration
    //USERNAME=IOverridesValueForUsername
    @Autowired
    Environment environment;

    @Value("${ajayonjava.username}")//takes the spring expression lang so need to put $ sign
    String username;

    @Value("${ajayonjava.password}")
    String password;

    @Value("${ajayonjava.dbUrl}")
    String dbUrl;

    //reads the data from jms.properties
    @Value("${ajayonjava.jms.username}")
    String jmsUsername;

    @Value("${ajayonjava.jms.password}")
    String jmsPassword;

    @Value("${ajayonjava.jms.dbUrl}")
    String jmsDbUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();

        //this will read the USERNAME parameter from env variable which is set through edit configuration
        fakeDataSource.setUsername(environment.getProperty("USERNAME"));

        //password and dbUrl member var are populated through datasource.properties file.
        fakeDataSource.setPassword(password);
        fakeDataSource.setDbUrl(dbUrl);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setDbUrl(jmsDbUrl);
        return fakeJmsBroker;
    }

    //this will read the properties file and will place the corresponding values in member variables
    public static PropertySourcesPlaceholderConfigurer properties(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
