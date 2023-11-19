package com.example.FukuFuku_Backend_Spring.entity;

import jakarta.persistence.*;

@Entity
public class UserImage {
    @Id
    private String url;
    @Column
    private String key;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
