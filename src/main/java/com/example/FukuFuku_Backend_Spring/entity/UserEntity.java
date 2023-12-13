package com.example.FukuFuku_Backend_Spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    @OneToMany(mappedBy = "userEntity")
    private List<UserImageEntity> userImage = new ArrayList<>(); // 이미지 주소

    private String familyName;  // 성

    private String givenName;   // 이름

    private Integer isAdmin;

    private String nickname;

    private String introduction;    // 자기소개

    @OneToMany(mappedBy = "userEntity")
    private List<BoardEntity> boardEntities = new ArrayList<>();

    @OneToMany(mappedBy = "userEntity")
    private List<CommentEntity> commentEntities = new ArrayList<>();

}
