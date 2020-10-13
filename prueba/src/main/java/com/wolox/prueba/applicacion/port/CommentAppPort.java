package com.wolox.prueba.applicacion.port;

import com.wolox.prueba.applicacion.dto.CommentDto;

import java.util.List;

public interface CommentAppPort {

    CommentDto guardar(CommentDto commentDto);

    void guardar(List<CommentDto> commentDtos);

    List<CommentDto> listar();

}
