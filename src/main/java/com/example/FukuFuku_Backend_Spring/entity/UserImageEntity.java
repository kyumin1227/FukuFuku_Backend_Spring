package com.example.FukuFuku_Backend_Spring.entity;

import jakarta.persistence.*;

@Entity
public class UserImageEntity {
    @Id
    private String url;
    @Column
    private String imageKey;
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;
}
