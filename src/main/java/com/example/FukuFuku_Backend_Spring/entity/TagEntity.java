package com.example.FukuFuku_Backend_Spring.entity;

import jakarta.persistence.*;

@Entity
public class TagEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
}
