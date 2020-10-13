package com.wolox.prueba.domain.port;

import com.wolox.prueba.domain.model.Comment;

import java.util.List;

public interface CommentRepositoryPort {

    Comment save(Comment comment);

    Comment findById(Long id);

    List<Comment> listar();
}
