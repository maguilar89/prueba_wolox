package com.wolox.prueba.applicacion.port;

import com.wolox.prueba.applicacion.dto.PhotoDto;

import java.util.List;

public interface PhotoAppPort {

    PhotoDto guardar(PhotoDto photoDto);

    void guardar(List<PhotoDto> photoDtos);

    List<PhotoDto> listar();
}
