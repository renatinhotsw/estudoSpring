package com.casadocodigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.casadocodigo.loja")
public class CasadocodigoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasadocodigoApplication.class, args);
	
	}
}
