package com.wolox.prueba.domain.port;

import com.wolox.prueba.domain.model.Photo;

import java.util.List;

public interface PhotoRepositoryPort {

    Photo save(Photo photo);

    Photo findById(Long id);

    List<Photo> listar();
}
