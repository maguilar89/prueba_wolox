package com.wolox.prueba.infrastructure.adapter.repository;

import com.wolox.prueba.domain.model.Photo;
import com.wolox.prueba.domain.port.PhotoRepositoryPort;
import com.wolox.prueba.infrastructure.adapter.jpa.PhotoJpaRepository;
import com.wolox.prueba.infrastructure.adapter.papper.PhotoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class PhotoRepositoryAdapter implements PhotoRepositoryPort {

    @Autowired
    private PhotoJpaRepository photoJpaRepository;
    @Autowired
    private PhotoMapper photoMapper;

    @Override
    public Photo save(Photo photo) {
        return  photoMapper.entityToDomine(photoJpaRepository.save(photoMapper.domineToEntity(photo)));
    }

    @Override
    public Photo findById(Long id) {
        return photoMapper.entityToDomine(photoJpaRepository.findById(id).get());
    }

    @Override
    public List<Photo> listar() {
        return photoMapper.entityToDomineList(photoJpaRepository.findAll());
    }
}
