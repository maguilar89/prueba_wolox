package com.wolox.prueba.infrastructure.adapter.papper;

import com.wolox.prueba.domain.model.Comment;
import com.wolox.prueba.infrastructure.adapter.entity.CommentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CommentMapper {

    Comment entityToDomine(CommentEntity commentEntity);

    CommentEntity domineToEntity(Comment comment);

    List<CommentEntity> domineToEntityList(List<Comment> comments);

    List<Comment> entityToDomineList(List<CommentEntity> commentEntities);
}
