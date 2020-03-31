package com.spring.example.spring.DI;

import com.spring.example.spring.DI.controllers.*;
import com.spring.example.spring.DI.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		MyController myController = (MyController) context.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("----------- Profile");
		I18Controller i18Controller = (I18Controller) context.getBean("i18Controller");
		System.out.println(i18Controller.sayGetGreetings());

		System.out.println("-----------Property Based");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreetings());

		System.out.println("-----------Setter Based");
		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreetings());

		System.out.println("-----------Constructor Based");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetings());

		System.out.println("---------Reading data from external properties with the help of PropertyConfig.java class");
		FakeDataSource fakeDataSource = (FakeDataSource) context.getBean(FakeDataSource.class);
		System.out.println("Details: "+fakeDataSource.getUsername()+" "+fakeDataSource.getPassword()+" "+fakeDataSource.getDbUrl());
	}

}
