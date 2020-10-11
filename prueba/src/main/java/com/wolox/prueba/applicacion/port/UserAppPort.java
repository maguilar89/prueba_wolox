package com.wolox.prueba.applicacion.port;

import com.wolox.prueba.applicacion.dto.UserDto;

public interface UserAppPort {

    UserDto guardar(UserDto userDto);
}
