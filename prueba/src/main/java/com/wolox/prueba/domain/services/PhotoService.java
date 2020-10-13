package com.wolox.prueba.domain.services;

import com.wolox.prueba.domain.model.Photo;
import com.wolox.prueba.domain.port.PhotoRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepositoryPort photoRepositoryPort;

    public Photo save(Photo photo) {
        return photoRepositoryPort.save(photo);
    }

    public void save(List<Photo> photos) {
        for (Photo photo : photos) {
            photoRepositoryPort.save(photo);
        }
    }

    public List<Photo> listar() {
        return photoRepositoryPort.listar();
    }

}
