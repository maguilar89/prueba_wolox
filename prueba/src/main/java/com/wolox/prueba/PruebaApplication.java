package com.wolox.prueba;

import com.wolox.prueba.applicacion.dto.AlbumDto;
import com.wolox.prueba.applicacion.dto.PhotoDto;
import com.wolox.prueba.applicacion.dto.UserDto;
import com.wolox.prueba.applicacion.service.AlbumAppService;
import com.wolox.prueba.applicacion.service.PhotoAppService;
import com.wolox.prueba.applicacion.service.UserAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class PruebaApplication implements CommandLineRunner {

    @Autowired
    private UserAppService userAppService;
    @Autowired
    private PhotoAppService photoAppService;
    @Autowired
    private AlbumAppService albumAppService;

    public static void main(String[] args) {
        SpringApplication.run(PruebaApplication.class, args);
    }


    @Override
    public void run(String... arg0) throws Exception {
        RestTemplate plantilla = new RestTemplate();
        UserDto[] users2 = plantilla.getForObject("https://jsonplaceholder.typicode.com/users", UserDto[].class);
        String users = plantilla.getForObject("https://jsonplaceholder.typicode.com/users", String.class);

        PhotoDto[] photo2 = plantilla.getForObject("https://jsonplaceholder.typicode.com/photos", PhotoDto[].class);
        String photos = plantilla.getForObject("https://jsonplaceholder.typicode.com/photos", String.class);

        AlbumDto[] album2 = plantilla.getForObject("https://jsonplaceholder.typicode.com/albums", AlbumDto[].class);
        String album = plantilla.getForObject("https://jsonplaceholder.typicode.com/albums", String.class);


        System.out.println(users);
        System.out.println(photos);
        System.out.println(album);

        userAppService.guardar(Arrays.asList(users2));
        photoAppService.guardar(Arrays.asList(photo2));
        albumAppService.guardar(Arrays.asList(album2));
    }

}
