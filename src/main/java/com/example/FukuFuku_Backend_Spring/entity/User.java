package com.example.FukuFuku_Backend_Spring.entity;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String email;
    @Column
    private String userImage; // 이미지 주소
    @Column
    private String familyName;  // 성
    @Column
    private String givenName;   // 이름
    @Column
    private Integer isAdmin;
    @Column
    private String nickname;
    @Column
    private String introduction;    // 자기소개

}
