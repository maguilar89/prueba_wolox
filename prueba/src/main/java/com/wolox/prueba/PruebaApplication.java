package com.wolox.prueba;

import com.wolox.prueba.infrastructure.util.ExternalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaApplication implements CommandLineRunner {

    @Autowired
    private ExternalServices externalServices;

    public static void main(String[] args) {
        SpringApplication.run(PruebaApplication.class, args);
    }


    @Override
    public void run(String... arg0) throws Exception {
        externalServices.initialService();
    }

}
