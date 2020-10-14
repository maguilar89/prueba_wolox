package com.wolox.prueba.applicacion.service;

import com.wolox.prueba.applicacion.dto.AlbumDto;
import com.wolox.prueba.applicacion.dto.AlbumProfileDto;
import com.wolox.prueba.applicacion.mapper.AlbumAppMapper;
import com.wolox.prueba.applicacion.mapper.AlbumProfileAppMapper;
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
    @Autowired
    private AlbumProfileAppMapper albumProfileAppMapper;

    @Override
    public AlbumProfileDto guardar(AlbumProfileDto albumProfileDto) {
        return albumProfileAppMapper.dominioADto(albumService.save(albumProfileAppMapper.dtoADominio(albumProfileDto)));
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
