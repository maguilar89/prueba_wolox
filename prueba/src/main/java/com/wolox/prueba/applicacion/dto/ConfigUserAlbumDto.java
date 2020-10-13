package com.wolox.prueba.applicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConfigUserAlbumDto {

    private Long userId;
    private Long albumId;
    private Boolean select;
    private Boolean update;
    private Boolean delete;
}
