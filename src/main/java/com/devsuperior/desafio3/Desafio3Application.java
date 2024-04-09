package com.devsuperior.desafio3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Desafio3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Pronto!!");	
		
	}

}
