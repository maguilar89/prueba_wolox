package com.wolox.prueba.applicacion.service;

import com.wolox.prueba.applicacion.dto.AlbumDto;
import com.wolox.prueba.applicacion.mapper.AlbumAppMapper;
import com.wolox.prueba.applicacion.port.AlbumAppPort;
import com.wolox.prueba.domain.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlbumAppService implements AlbumAppPort {

    @Autowired
    private AlbumService albumService;
    @Autowired
    private AlbumAppMapper albumAppMapper;


    @Override
    public AlbumDto guardar(AlbumDto albumDto) {
        return albumAppMapper.dominioADto(albumService.save(albumAppMapper.dtoADominio(albumDto)));
    }

    @Override
    public void guardar(List<AlbumDto> albumDtos) {
        albumService.save(albumAppMapper.dtoToDtoList(albumDtos));
    }

    @Override
    public List<AlbumDto> listar() {
        return albumAppMapper.domineToDtoList(albumService.listar());
    }
}
