package com.example.FukuFuku_Backend_Spring.entity;

import jakarta.persistence.*;

@Entity
public class BoardImage {

    @Id
    private String url;
    @Column
    private String key;
    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;
}
