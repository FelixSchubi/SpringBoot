package com.explorer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAndPolymerApplication {


	public static void main(String[] args) {
	
	SpringApplication appFelix = new SpringApplication(SpringBootAndPolymerApplication.class);

	System.out.println("Das ist ein Test!");
	
   	appFelix.run(args);

	}

}


