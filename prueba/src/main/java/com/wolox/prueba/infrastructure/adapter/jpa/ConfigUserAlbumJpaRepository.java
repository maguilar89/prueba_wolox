package com.wolox.prueba.infrastructure.adapter.jpa;

import com.wolox.prueba.infrastructure.adapter.entity.ConfigUserAlbumEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigUserAlbumJpaRepository extends JpaRepository<ConfigUserAlbumEntity, Long> {

}
