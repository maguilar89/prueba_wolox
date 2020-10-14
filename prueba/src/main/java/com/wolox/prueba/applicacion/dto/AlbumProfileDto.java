package com.wolox.prueba.applicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlbumProfileDto {

    private Long id;
    private Long userId;
    private String title;
    private ConfigUserAlbumDto configUserAlbum;
}
