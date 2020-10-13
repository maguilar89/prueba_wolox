package com.wolox.prueba.domain.services;

import com.wolox.prueba.domain.model.ConfigUserAlbum;
import com.wolox.prueba.domain.port.ConfigUserAlbumRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigUserAlbumService {

    @Autowired
    private ConfigUserAlbumRepositoryPort configUserAlbumRepositoryPort;

    public ConfigUserAlbum save(ConfigUserAlbum configUserAlbum) {

        return configUserAlbumRepositoryPort.save(configUserAlbum);
    }

    public void save(List<ConfigUserAlbum> configUserAlbums) {
        for (ConfigUserAlbum configUserAlbum : configUserAlbums) {
            configUserAlbumRepositoryPort.save(configUserAlbum);
        }
    }

    public List<ConfigUserAlbum> listar() {
        return configUserAlbumRepositoryPort.listar();
    }


}
