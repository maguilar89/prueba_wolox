package com.wolox.prueba.infrastructure.adapter.papper;

import com.wolox.prueba.domain.model.Album;
import com.wolox.prueba.infrastructure.adapter.entity.AlbumEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AlbumMapper {

    Album entityToDomine(AlbumEntity albumEntity);

    AlbumEntity domineToEntity(Album album);

    List<AlbumEntity> domineToEntityList(List<Album> list);

    List<Album> entityToDomineList(List<AlbumEntity> list);
}
