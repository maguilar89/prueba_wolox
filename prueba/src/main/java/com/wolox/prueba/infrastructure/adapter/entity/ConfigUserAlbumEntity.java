package com.wolox.prueba.infrastructure.adapter.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "public.config_user_album")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ConfigUserAlbumEntity implements Serializable {

    @Id
    @Column(name = "album_id")
    private Long albumId;
    @Id
    @Column(name = "user_id")
    private String userId;
    @Column(name = "select")
    private Boolean select;
    @Column(name = "update")
    private Boolean update;
    @Column(name = "delete")
    private Boolean delete;
}
