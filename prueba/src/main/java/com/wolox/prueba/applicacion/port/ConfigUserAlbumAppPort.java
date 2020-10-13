package com.wolox.prueba.applicacion.port;

import com.wolox.prueba.applicacion.dto.ConfigUserAlbumDto;

import java.util.List;

public interface ConfigUserAlbumAppPort {

    ConfigUserAlbumDto guardar(ConfigUserAlbumDto configUserAlbumDto);

    void guardar(List<ConfigUserAlbumDto> configUserAlbumDtos);

    List<ConfigUserAlbumDto> listar();
}
