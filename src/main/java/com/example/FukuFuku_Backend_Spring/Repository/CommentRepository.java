package com.example.FukuFuku_Backend_Spring.Repository;

import com.example.FukuFuku_Backend_Spring.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
}
