package com.wolox.prueba.domain.port;

import com.wolox.prueba.domain.model.ConfigUserAlbum;

import java.util.List;

public interface ConfigUserAlbumRepositoryPort {

    ConfigUserAlbum save(ConfigUserAlbum configUserAlbum);

    ConfigUserAlbum findById(Long id);

    List<ConfigUserAlbum> listar();
}
