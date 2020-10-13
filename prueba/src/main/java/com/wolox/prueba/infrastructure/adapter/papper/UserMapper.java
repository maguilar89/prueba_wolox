package com.wolox.prueba.infrastructure.adapter.papper;

import com.wolox.prueba.domain.model.User;
import com.wolox.prueba.infrastructure.adapter.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {

    User entityToDomine(UserEntity userEntity);

    UserEntity domineToEntity(User user);

    List<UserEntity> domineToEntityList(List<User> list);

    List<User> entityToDomineList(List<UserEntity> list);


}
