package com.wolox.prueba.domain.services;

import com.wolox.prueba.applicacion.dto.AlbumProfileDto;
import com.wolox.prueba.domain.model.Album;
import com.wolox.prueba.domain.model.AlbumProfile;
import com.wolox.prueba.domain.model.ConfigUserAlbum;
import com.wolox.prueba.domain.port.AlbumRepositoryPort;
import com.wolox.prueba.domain.port.ConfigUserAlbumRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepositoryPort albumRepositoryPort;
    @Autowired
    private ConfigUserAlbumRepositoryPort configUserAlbumRepositoryPort;

    @Transactional
    public AlbumProfile save(AlbumProfile albumProfile) {
        Album album = new Album();
        album.setId(albumProfile.getId());
        album.setTitle(albumProfile.getTitle());
        album.setUserId(albumProfile.getUserId());
        albumRepositoryPort.save(album);
        ConfigUserAlbum configUserAlbum = new ConfigUserAlbum();
        configUserAlbum = configUserAlbumRepositoryPort.save(albumProfile.getConfigUserAlbum());
        albumProfile.setConfigUserAlbum(configUserAlbum);
        return albumProfile;
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
