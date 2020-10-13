package com.wolox.prueba.domain.services;

import com.wolox.prueba.domain.model.Comment;
import com.wolox.prueba.domain.port.CommentRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepositoryPort commentRepositoryPort;

    public Comment save(Comment comment) {
        return commentRepositoryPort.save(comment);
    }

    public void save(List<Comment> comments) {
        for (Comment comment : comments) {
            commentRepositoryPort.save(comment);
        }
    }

    public List<Comment> listar(){
        return commentRepositoryPort.listar();
    }


}
