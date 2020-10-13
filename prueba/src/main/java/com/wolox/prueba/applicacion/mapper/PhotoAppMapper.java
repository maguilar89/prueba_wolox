package com.wolox.prueba.applicacion.mapper;

import com.wolox.prueba.applicacion.dto.PhotoDto;
import com.wolox.prueba.domain.model.Photo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PhotoAppMapper {

    PhotoDto dominioADto(Photo photo);

    Photo dtoADominio(PhotoDto photoDto);

    List<PhotoDto> domineToDtoList(List<Photo> photos);

    List<Photo> dtoToDtoList(List<PhotoDto> photoDtos);
}
