package com.example.FukuFuku_Backend_Spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class BoardEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    private String title;

    private String content;

    private Integer views;

    private LocalDateTime createAt;

    @OneToMany(mappedBy = "boardEntity")
    private List<BoardImageEntity> boardImageEntities = new ArrayList<>();

//    @OneToMany
//    @JoinTable(name = "board_tag",
//            joinColumns = @JoinColumn(name = "board_id"),
//            inverseJoinColumns = @JoinColumn(name = "tag_id"))
//    private List<TagEntity> tagEntities = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "board_tag_id")
    private BoardTagEntity boardTagEntity;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

    @OneToMany(mappedBy = "boardEntity")
    private List<CommentEntity> commentEntities = new ArrayList<>();

}
