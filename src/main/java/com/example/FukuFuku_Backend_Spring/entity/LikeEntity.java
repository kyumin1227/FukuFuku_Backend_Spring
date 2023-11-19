package com.example.FukuFuku_Backend_Spring.entity;

import jakarta.persistence.*;

@Entity
public class LikeEntity {

    @EmbeddedId
    private LikeId id;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @ManyToOne
//    @JoinColumn(name = "board_id")
//    private Board board;
}