package com.wolox.prueba.applicacion.mapper;

import com.wolox.prueba.applicacion.dto.AlbumDto;
import com.wolox.prueba.domain.model.Album;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AlbumAppMapper {

    AlbumDto dominioADto(Album album);

    Album dtoADominio(AlbumDto userDto);

    List<AlbumDto> domineToDtoList(List<Album> albums);

    List<Album> dtoToDtoList(List<AlbumDto> albumDtos);
}
