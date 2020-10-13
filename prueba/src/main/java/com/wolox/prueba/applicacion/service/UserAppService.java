package com.wolox.prueba.applicacion.service;

import com.wolox.prueba.applicacion.dto.PhotoDto;
import com.wolox.prueba.applicacion.dto.UserDto;
import com.wolox.prueba.applicacion.mapper.PhotoAppMapper;
import com.wolox.prueba.applicacion.mapper.UserAppMapper;
import com.wolox.prueba.applicacion.port.UserAppPort;
import com.wolox.prueba.domain.model.Photo;
import com.wolox.prueba.domain.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserAppService implements UserAppPort {

    @Autowired
    private UserService userService;
    @Autowired
    private UserAppMapper userAppMapper;
    @Autowired
    private PhotoAppMapper photoAppMapper;

    @Override
    public UserDto guardar(UserDto userDto) {
        return  userAppMapper.dominioADto(userService.save(userAppMapper.dtoADominio(userDto)));
    }

    @Override
    public void guardar(List<UserDto> userDto) {
        userService.save(userAppMapper.dtoToDtoList(userDto));
    }

    @Override
    public List<UserDto> listar() {
        return  userAppMapper.domineToDtoList(userService.listar());
    }

    @Override
    public List<PhotoDto>  buscar(String userName) {
        return  photoAppMapper.domineToDtoList(userService.findByUserName(userName));
    }
}
