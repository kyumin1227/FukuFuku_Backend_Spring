package com.example.FukuFuku_Backend_Spring.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private Integer views;
    @Column
    private Date createAt;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToMany
    @JoinTable(name = "boardTag")
    private List<Tag> tags;
}
