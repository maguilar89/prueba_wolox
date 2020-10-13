package com.wolox.prueba.infrastructure.adapter.repository;

import com.wolox.prueba.domain.model.Album;
import com.wolox.prueba.domain.port.AlbumRepositoryPort;
import com.wolox.prueba.infrastructure.adapter.jpa.AlbumJpaRepository;
import com.wolox.prueba.infrastructure.adapter.papper.AlbumMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class AlbumRepositoryAdapter implements AlbumRepositoryPort {

    @Autowired
    private AlbumJpaRepository albumJpaRepository;
    @Autowired
    private AlbumMapper albumMapper;

    @Override
    public Album save(Album album) {
        return albumMapper.entityToDomine(albumJpaRepository.save(albumMapper.domineToEntity(album)));
    }

    @Override
    public Album findById(Long id) {
        return albumMapper.entityToDomine(albumJpaRepository.findById(id).get());
    }

    @Override
    public List<Album> listar() {
        return  albumMapper.entityToDomineList(albumJpaRepository.findAll());
    }
}
