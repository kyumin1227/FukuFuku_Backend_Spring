package com.example.FukuFuku_Backend_Spring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class BoardTagEntity {

    @Id @GeneratedValue
    private Long id;

    @OneToMany
    private List<TagEntity> tagEntities = new ArrayList<>();

    @OneToOne(mappedBy = "boardTagEntity", fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private BoardEntity boardEntity;

}
