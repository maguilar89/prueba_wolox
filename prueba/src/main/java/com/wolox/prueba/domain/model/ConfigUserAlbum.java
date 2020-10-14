package com.wolox.prueba.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConfigUserAlbum implements Serializable {

    private Long userId;
    private Long albumId;
    private Boolean read;
    private Boolean update;
    private Boolean delete;
}
