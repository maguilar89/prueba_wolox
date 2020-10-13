package com.wolox.prueba.infrastructure.adapter.entity;

import com.wolox.prueba.infrastructure.adapter.entity.classId.ConfigUserAlbumPk;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "public.config_user_album")
@IdClass(ConfigUserAlbumPk.class)
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
    private Long userId;
    @Column(name = "select")
    private Boolean select;
    @Column(name = "update")
    private Boolean update;
    @Column(name = "delete")
    private Boolean delete;
}
