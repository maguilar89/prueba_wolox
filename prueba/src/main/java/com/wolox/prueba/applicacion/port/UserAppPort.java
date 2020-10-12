package com.wolox.prueba.applicacion.port;

import com.wolox.prueba.applicacion.dto.UserDto;

import java.util.List;

public interface UserAppPort {

    UserDto guardar(UserDto userDto);

    void guardar(List<UserDto> userDto);
}
