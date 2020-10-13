package com.wolox.prueba.infrastructure.adapter.papper;

import com.wolox.prueba.domain.model.ConfigUserAlbum;
import com.wolox.prueba.infrastructure.adapter.entity.ConfigUserAlbumEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ConfigUserAlbumMapper {

    ConfigUserAlbum entityToDomine(ConfigUserAlbumEntity configUserAlbumEntity);

    ConfigUserAlbumEntity domineToEntity(ConfigUserAlbum configUserAlbum);

    List<ConfigUserAlbumEntity> domineToEntityList(List<ConfigUserAlbum> list);

    List<ConfigUserAlbum> entityToDomineList(List<ConfigUserAlbumEntity> list);
}
