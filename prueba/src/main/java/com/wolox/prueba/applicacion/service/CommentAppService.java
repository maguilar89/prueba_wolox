package com.wolox.prueba.applicacion.service;

import com.wolox.prueba.applicacion.dto.CommentDto;
import com.wolox.prueba.applicacion.mapper.CommentAppMapper;
import com.wolox.prueba.applicacion.port.CommentAppPort;
import com.wolox.prueba.domain.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommentAppService implements CommentAppPort {

    @Autowired
    private CommentService commentService;
    @Autowired
    private CommentAppMapper commentAppMapper;

    @Override
    public CommentDto guardar(CommentDto commentDto) {
        return commentAppMapper.dominioADto(commentService.save(commentAppMapper.dtoADominio(commentDto)));
    }

    @Override
    public void guardar(List<CommentDto> commentDtos) {
        commentService.save(commentAppMapper.dtoToDtoList(commentDtos));
    }

    @Override
    public List<CommentDto> listar() {
        return commentAppMapper.domineToDtoList(commentService.listar());
    }

    @Override
    public List<CommentDto> buscar(String name){
        return commentAppMapper.domineToDtoList(commentService.listar(name));
    }
}
