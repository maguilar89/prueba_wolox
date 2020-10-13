package com.wolox.prueba.applicacion.mapper;

import com.wolox.prueba.applicacion.dto.CommentDto;
import com.wolox.prueba.domain.model.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CommentAppMapper {

    CommentDto dominioADto(Comment comment);

    Comment dtoADominio(CommentDto commentDto);

    List<CommentDto> domineToDtoList(List<Comment> comments);

    List<Comment> dtoToDtoList(List<CommentDto> commentDtos);
}
