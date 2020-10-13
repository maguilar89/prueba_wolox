package com.wolox.prueba.infrastructure.adapter.jpa;

import com.wolox.prueba.infrastructure.adapter.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {

    @Query("SELECT pho.albumId, pho.id, pho.title, pho.url, pho.thumbnailUrl FROM public.photo pho "
            + "inner join public.album alb on alb.id = pho.albumId "
            + "inner join public.user u on u.id= alb.userId "
            + "WHERE u.username = :username ")
    List<Object[]> findByUserName(@Param(value = "username") String username);

}
