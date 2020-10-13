package com.wolox.prueba.infrastructure.adapter.jpa;

import com.wolox.prueba.infrastructure.adapter.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentJpaRepository extends JpaRepository<CommentEntity, Long> {

}
