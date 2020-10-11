package com.wolox.prueba.infrastructure.adapter.papper;

import com.wolox.prueba.domain.model.User;
import com.wolox.prueba.infrastructure.adapter.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {

    User entityToDomine(UserEntity userEntity);

    UserEntity domineToEntity(User user);


}
