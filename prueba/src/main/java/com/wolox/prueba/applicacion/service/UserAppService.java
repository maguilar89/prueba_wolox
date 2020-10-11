package com.wolox.prueba.applicacion.service;

import com.wolox.prueba.applicacion.dto.UserDto;
import com.wolox.prueba.applicacion.port.UserAppPort;
import org.springframework.stereotype.Component;

@Component
public class UserAppService implements UserAppPort {

    @Override
    public UserDto guardar(UserDto userDto) {
        return null;
    }
}
