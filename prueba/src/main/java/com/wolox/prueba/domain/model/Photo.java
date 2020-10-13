package com.wolox.prueba.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Photo {

    private Long albumId;
    private Long id;
    private String title;
    private String url;
    private String thumbnailUrl;
}
