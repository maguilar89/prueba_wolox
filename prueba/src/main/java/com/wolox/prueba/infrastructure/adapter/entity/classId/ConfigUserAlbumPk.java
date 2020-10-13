package com.wolox.prueba.infrastructure.adapter.entity.classId;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ConfigUserAlbumPk implements Serializable {
    private Long albumId;
    private Long userId;
}
