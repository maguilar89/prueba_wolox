package com.wolox.prueba;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PruebaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}


	@Override
	public void run(String... arg0) throws Exception {
		RestTemplate plantilla = new RestTemplate();
		String resultado = plantilla.getForObject("https://jsonplaceholder.typicode.com/users", String.class);
		System.out.println(resultado);
	}

}
