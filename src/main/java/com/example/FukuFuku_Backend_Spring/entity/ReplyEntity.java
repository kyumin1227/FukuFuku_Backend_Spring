//package com.example.FukuFuku_Backend_Spring.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Entity
//@Getter @Setter
//public class ReplyEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column
//    private String comment;
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private UserEntity userEntity;
//    @ManyToOne
//    @JoinColumn(name = "board_id")
//    private BoardEntity boardEntity;
//}
