package com.wolox.prueba.applicacion.port;

import com.wolox.prueba.applicacion.dto.AlbumDto;

import java.util.List;

public interface AlbumAppPort {

    AlbumDto guardar(AlbumDto albumDto);

    void guardar(List<AlbumDto> albumDtos);

    List<AlbumDto> listar();
}
