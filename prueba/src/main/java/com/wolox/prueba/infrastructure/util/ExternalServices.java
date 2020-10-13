package com.wolox.prueba.infrastructure.util;

import com.wolox.prueba.applicacion.dto.AlbumDto;
import com.wolox.prueba.applicacion.dto.CommentDto;
import com.wolox.prueba.applicacion.dto.PhotoDto;
import com.wolox.prueba.applicacion.dto.UserDto;
import com.wolox.prueba.applicacion.service.AlbumAppService;
import com.wolox.prueba.applicacion.service.CommentAppService;
import com.wolox.prueba.applicacion.service.PhotoAppService;
import com.wolox.prueba.applicacion.service.UserAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class ExternalServices {

    @Autowired
    private UserAppService userAppService;
    @Autowired
    private PhotoAppService photoAppService;
    @Autowired
    private AlbumAppService albumAppService;
    @Autowired
    private CommentAppService commentAppService;

    public void initialService(){
        RestTemplate plantilla = new RestTemplate();

        UserDto[] users2 = plantilla.getForObject("https://jsonplaceholder.typicode.com/users", UserDto[].class);
        userAppService.guardar(Arrays.asList(users2));
        PhotoDto[] photo2 = plantilla.getForObject("https://jsonplaceholder.typicode.com/photos", PhotoDto[].class);
        photoAppService.guardar(Arrays.asList(photo2));
        AlbumDto[] album2 = plantilla.getForObject("https://jsonplaceholder.typicode.com/albums", AlbumDto[].class);
        albumAppService.guardar(Arrays.asList(album2));
        CommentDto[] comment2 = plantilla.getForObject("https://jsonplaceholder.typicode.com/comments", CommentDto[].class);
        commentAppService.guardar(Arrays.asList(comment2));
    }
}
