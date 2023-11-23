package com.example.FukuFuku_Backend_Spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class BoardImageEntity {

    @Id
    private String url;
    @Column
    private String imageKey;
    @ManyToOne
    @JoinColumn(name = "board_id")
    private BoardEntity boardEntity;
}
