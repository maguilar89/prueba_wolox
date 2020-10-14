package com.wolox.prueba.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlbumProfile {

    private Long id;
    private Long userId;
    private String title;
    private ConfigUserAlbum configUserAlbum;
}
