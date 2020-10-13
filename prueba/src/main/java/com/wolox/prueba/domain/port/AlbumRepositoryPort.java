package com.wolox.prueba.domain.port;

import com.wolox.prueba.domain.model.Album;

import java.util.List;

public interface AlbumRepositoryPort {

    Album save(Album album);

    Album findById(Long id);

    List<Album> listar();
}
