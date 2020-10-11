package com.wolox.prueba.applicacion.mapper;

import com.wolox.prueba.applicacion.dto.UserDto;
import com.wolox.prueba.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {

    UserDto domineADto(User user);

    User dtoADominio(UserDto userDto);

    List<UserDto> domineADtoList(List<User> users);
}
