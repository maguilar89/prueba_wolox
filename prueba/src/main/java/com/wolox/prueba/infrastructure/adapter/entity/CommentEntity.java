package com.wolox.prueba.infrastructure.adapter.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "public.comment")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommentEntity {

    @Id
    private Long id;
    @Column(name = "post_id")
    private Long postId;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "body")
    private String body;
}
