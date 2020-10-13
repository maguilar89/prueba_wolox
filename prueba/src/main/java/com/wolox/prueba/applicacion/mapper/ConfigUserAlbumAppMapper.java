package com.wolox.prueba.applicacion.mapper;

import com.wolox.prueba.applicacion.dto.ConfigUserAlbumDto;
import com.wolox.prueba.domain.model.ConfigUserAlbum;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ConfigUserAlbumAppMapper {

    ConfigUserAlbumDto dominioADto(ConfigUserAlbum configUserAlbum);

    ConfigUserAlbum dtoADominio(ConfigUserAlbumDto configUserAlbumDto);

    List<ConfigUserAlbumDto> domineToDtoList(List<ConfigUserAlbum> configUserAlbums);

    List<ConfigUserAlbum> dtoToDtoList(List<ConfigUserAlbumDto> configUserAlbumDtos);
}
