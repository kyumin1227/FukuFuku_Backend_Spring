package com.example.FukuFuku_Backend_Spring.entity;

import jakarta.persistence.*;

import java.io.Serializable;

// 복합키 생성
@Embeddable
class LikeId implements Serializable {

    private Long userId;
    private Long boardId;
}

@Entity
public class Like {

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