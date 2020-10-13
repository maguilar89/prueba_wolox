package com.wolox.prueba.infrastructure.adapter.jpa;

import com.wolox.prueba.infrastructure.adapter.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentJpaRepository extends JpaRepository<CommentEntity, Long> {

    List<CommentEntity> findByName(String name);

}
