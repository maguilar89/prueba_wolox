package com.wolox.prueba.infrastructure.adapter.repository;

import com.wolox.prueba.applicacion.dto.PhotoDto;
import com.wolox.prueba.domain.model.Photo;
import com.wolox.prueba.domain.model.User;
import com.wolox.prueba.domain.port.UserRepositoryPort;
import com.wolox.prueba.infrastructure.adapter.entity.UserEntity;
import com.wolox.prueba.infrastructure.adapter.jpa.UserJpaRepository;
import com.wolox.prueba.infrastructure.adapter.papper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Slf4j
@Component
public class UserRepositoryAdapter implements UserRepositoryPort {

    @Autowired
    private UserJpaRepository userJpaRepository;
    @Autowired
    private UserMapper userMapper;

    @Override
    public User save(User user) {
        UserEntity userEntity = userMapper.domineToEntity(user);
        UserEntity userEntity2  = userJpaRepository.save(userEntity);
        return null;
    }

    @Override
    public User findById(Long id) {
        return userMapper.entityToDomine(userJpaRepository.findById(id).get());
    }

    @Override
    public List<User> listar() {
        return userMapper.entityToDomineList(userJpaRepository.findAll());
    }

    @Override
    public List<Photo> findByUserName(String userName) {

        List<Photo> photos = new LinkedList<>();
        Photo photo = new Photo();
        for (Object[] photoObject : userJpaRepository.findByUserName(userName)) {
            photo.setAlbumId(Long.valueOf(photoObject[0].toString()));
            photo.setId(Long.valueOf(photoObject[1].toString()));
            photo.setTitle(photoObject[2].toString());
            photo.setUrl(photoObject[3].toString());
            photo.setThumbnailUrl(photoObject[4].toString());
            photos.add(photo);
        }
        return photos;
    }
}
