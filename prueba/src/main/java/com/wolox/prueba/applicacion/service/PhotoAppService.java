package com.wolox.prueba.applicacion.service;

import com.wolox.prueba.applicacion.dto.PhotoDto;
import com.wolox.prueba.applicacion.mapper.PhotoAppMapper;
import com.wolox.prueba.applicacion.port.PhotoAppPort;
import com.wolox.prueba.domain.services.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PhotoAppService implements PhotoAppPort {

    @Autowired
    private PhotoService photoService;
    @Autowired
    private PhotoAppMapper photoAppMapper;

    @Override
    public PhotoDto guardar(PhotoDto photoDto) {
        return photoAppMapper.dominioADto(photoService.save(photoAppMapper.dtoADominio(photoDto)));
    }

    @Override
    public void guardar(List<PhotoDto> photoDtos) {
        photoService.save(photoAppMapper.dtoToDtoList(photoDtos));
    }

    @Override
    public List<PhotoDto> listar() {
        return photoAppMapper.domineToDtoList(photoService.listar());
    }
}
