package com.wolox.prueba.infrastructure.adapter.repository;

import com.wolox.prueba.domain.model.ConfigUserAlbum;
import com.wolox.prueba.domain.port.ConfigUserAlbumRepositoryPort;
import com.wolox.prueba.infrastructure.adapter.entity.ConfigUserAlbumEntity;
import com.wolox.prueba.infrastructure.adapter.jpa.ConfigUserAlbumJpaRepository;
import com.wolox.prueba.infrastructure.adapter.papper.ConfigUserAlbumMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class ConfigUserAlbumRepositoryAdapter implements ConfigUserAlbumRepositoryPort {

    @Autowired
    private ConfigUserAlbumJpaRepository configUserAlbumJpaRepository;
    @Autowired
    private ConfigUserAlbumMapper configUserAlbumMapper;

    @Override
    public ConfigUserAlbum save(ConfigUserAlbum configUserAlbum) {
        ConfigUserAlbumEntity configUserAlbumEntity = configUserAlbumMapper.domineToEntity(configUserAlbum);
        configUserAlbumEntity = configUserAlbumJpaRepository.save(configUserAlbumEntity);
        configUserAlbum = configUserAlbumMapper.entityToDomine(configUserAlbumEntity);

        return configUserAlbum;
    }

    @Override
    public ConfigUserAlbum findById(Long id) {
        return configUserAlbumMapper.entityToDomine(configUserAlbumJpaRepository.findById(id).get());
    }

    @Override
    public List<ConfigUserAlbum> listar() {
        return configUserAlbumMapper.entityToDomineList(configUserAlbumJpaRepository.findAll());
    }
}
