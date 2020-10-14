package com.wolox.prueba.applicacion.port;

import com.wolox.prueba.applicacion.dto.AlbumDto;
import com.wolox.prueba.applicacion.dto.AlbumProfileDto;

import java.util.List;

public interface AlbumAppPort {

    AlbumProfileDto guardar(AlbumProfileDto albumProfileDto);

    void guardar(List<AlbumDto> albumDtos);

    List<AlbumDto> listar();
}
