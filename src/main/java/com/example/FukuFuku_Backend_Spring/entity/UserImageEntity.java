package com.example.FukuFuku_Backend_Spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserImageEntity {
    @Id
    private String url;
    @Column
    private String imageKey;
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;
}
