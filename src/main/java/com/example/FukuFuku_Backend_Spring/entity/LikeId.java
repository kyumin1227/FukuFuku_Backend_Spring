package com.example.FukuFuku_Backend_Spring.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

// 복합키 생성
@Embeddable
public class LikeId implements Serializable {

    private UserEntity userId;
    private BoardEntity boardId;
}