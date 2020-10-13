package com.wolox.prueba;

import com.wolox.prueba.infrastructure.config.SwaggerConfig;
import com.wolox.prueba.infrastructure.util.ExternalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@Import(SwaggerConfig.class)
@EnableWebMvc
public class PruebaApplication implements CommandLineRunner, WebMvcConfigurer {

    @Autowired
    private ExternalServices externalServices;

    public static void main(String[] args) {
        SpringApplication.run(PruebaApplication.class, args);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/swagger-ui.html**")
                .addResourceLocations("classpath:/resources/swagger-ui.html");
        registry
                .addResourceHandler("**/**")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry
                .addResourceHandler("**/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

    @Override
    public void run(String... arg0) throws Exception {
        externalServices.initialService();
    }

}
