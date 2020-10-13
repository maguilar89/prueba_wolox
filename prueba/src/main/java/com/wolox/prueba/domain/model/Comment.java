package com.wolox.prueba.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    private Long id;
    private Long postId;
    private String name;
    private String email;
    private String body;
}
