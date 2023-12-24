package com.example.Singletondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SingletonDemoApplication {

	//Obtenemos dos instancias del bean SingletonDemo
	//Imprimimos un mensaje que indica si ambas instancias son iguales o no.
	//Dado que utilizamos el ambito "singleton", ambas instancias deberian ser iguales
	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SingletonDemoApplication.class, args);

		SingletonDemo instance1 = context.getBean(SingletonDemo.class);
		SingletonDemo instance2 = context.getBean(SingletonDemo.class);

		System.out.println("Las instancias son iguales? " + (instance1 == instance2));

		context.close();
	}

}
