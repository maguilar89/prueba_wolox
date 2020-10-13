package com.wolox.prueba.applicacion.service;

import com.wolox.prueba.applicacion.dto.ConfigUserAlbumDto;
import com.wolox.prueba.applicacion.mapper.ConfigUserAlbumAppMapper;
import com.wolox.prueba.applicacion.port.ConfigUserAlbumAppPort;
import com.wolox.prueba.domain.services.ConfigUserAlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConfigUserAlbumAppService implements ConfigUserAlbumAppPort {

    @Autowired
    private ConfigUserAlbumService configUserAlbumService;
    @Autowired
    private ConfigUserAlbumAppMapper configUserAlbumAppMapper;

    @Override
    public ConfigUserAlbumDto guardar(ConfigUserAlbumDto configUserAlbumDto) {
        return configUserAlbumAppMapper.dominioADto(configUserAlbumService.save(configUserAlbumAppMapper.dtoADominio(configUserAlbumDto)));
    }

    @Override
    public void guardar(List<ConfigUserAlbumDto> configUserAlbumDtos) {
        configUserAlbumService.save(configUserAlbumAppMapper.dtoToDtoList(configUserAlbumDtos));
    }

    @Override
    public List<ConfigUserAlbumDto> listar() {
        return configUserAlbumAppMapper.domineToDtoList(configUserAlbumService.listar());
    }
}
