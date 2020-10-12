package com.wolox.prueba.infrastructure.adapter.jpa;

import com.wolox.prueba.infrastructure.adapter.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {

}
