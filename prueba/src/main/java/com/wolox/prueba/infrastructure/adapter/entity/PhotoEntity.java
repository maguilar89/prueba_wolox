package com.wolox.prueba.infrastructure.adapter.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "public.photo")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PhotoEntity {

    @Id
    private Long id;
    @Column(name = "album_id")
    private Long albumId;
    @Column(name = "title")
    private String title;
    @Column(name = "url")
    private String url;
    @Column(name = "thumbnail_url")
    private String thumbnailUrl;
}
