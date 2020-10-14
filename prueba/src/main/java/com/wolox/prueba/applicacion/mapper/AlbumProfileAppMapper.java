package com.wolox.prueba.applicacion.mapper;

import com.wolox.prueba.applicacion.dto.AlbumProfileDto;
import com.wolox.prueba.domain.model.AlbumProfile;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AlbumProfileAppMapper {

    AlbumProfileDto dominioADto(AlbumProfile albumProfile);

    AlbumProfile dtoADominio(AlbumProfileDto albumProfileDto);

    List<AlbumProfileDto> domineToDtoList(List<AlbumProfile> albumProfiles);

    List<AlbumProfile> dtoToDtoList(List<AlbumProfileDto> albumProfileDtos);
}
