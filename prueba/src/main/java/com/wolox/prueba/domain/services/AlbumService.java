package com.wolox.prueba.domain.services;

import com.wolox.prueba.domain.model.Album;
import com.wolox.prueba.domain.port.AlbumRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepositoryPort albumRepositoryPort;

    public Album save(Album album) {
        return albumRepositoryPort.save(album);
    }

    public void save(List<Album> albums) {
        for (Album album : albums) {
            albumRepositoryPort.save(album);
        }
    }

    public List<Album> listar(){
        return albumRepositoryPort.listar();
    }

}
