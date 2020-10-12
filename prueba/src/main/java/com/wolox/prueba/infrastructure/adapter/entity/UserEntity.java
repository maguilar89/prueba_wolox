package com.wolox.prueba.infrastructure.adapter.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "public.user")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "street")
    private String street;
    @Column(name = "suite")
    private String suite;
    @Column(name = "city")
    private String city;
    @Column(name = "zipcode")
    private String zipcode;
    @Column(name = "lat")
    private String lat;
    @Column(name = "lng")
    private String lng;
    @Column(name = "phone")
    private String phone;
    @Column(name = "website")
    private String website;
    @Column(name = "name_company")
    private String name_company;
    @Column(name = "catch_phrase")
    private String catchPhrase;
    @Column(name = "bs")
    private String bs;
}
