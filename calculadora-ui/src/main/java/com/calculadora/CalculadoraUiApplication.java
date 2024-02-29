package com.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.calculadora")
public class CalculadoraUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraUiApplication.class, args);
	}

}
