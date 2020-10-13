package com.wolox.prueba.infrastructure.adapter.repository;

import com.wolox.prueba.domain.model.Comment;
import com.wolox.prueba.domain.port.CommentRepositoryPort;
import com.wolox.prueba.infrastructure.adapter.jpa.CommentJpaRepository;
import com.wolox.prueba.infrastructure.adapter.papper.CommentMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class CommentRepositoryAdapter implements CommentRepositoryPort {

    @Autowired
    private CommentJpaRepository commentJpaRepository;
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public Comment save(Comment comment) {
        return commentMapper.entityToDomine(commentJpaRepository.save(commentMapper.domineToEntity(comment)));
    }

    @Override
    public Comment findById(Long id) {
        return commentMapper.entityToDomine(commentJpaRepository.findById(id).get());
    }

    @Override
    public List<Comment> listar() {
        return commentMapper.entityToDomineList(commentJpaRepository.findAll());
    }

    @Override
    public List<Comment> listar(String name) {
        return commentMapper.entityToDomineList(commentJpaRepository.findByName(name));
    }
}
