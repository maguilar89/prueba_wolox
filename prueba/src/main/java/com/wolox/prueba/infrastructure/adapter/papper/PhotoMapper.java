package com.wolox.prueba.infrastructure.adapter.papper;

import com.wolox.prueba.domain.model.Photo;
import com.wolox.prueba.infrastructure.adapter.entity.PhotoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PhotoMapper {

    Photo entityToDomine(PhotoEntity photoEntity);

    PhotoEntity domineToEntity(Photo photo);

    List<PhotoEntity> domineToEntityList(List<Photo> list);

    List<Photo> entityToDomineList(List<PhotoEntity> list);

}
