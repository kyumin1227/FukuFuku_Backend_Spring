package com.example.FukuFuku_Backend_Spring.Repository;

import com.example.FukuFuku_Backend_Spring.entity.LikeEntity;
import com.example.FukuFuku_Backend_Spring.entity.LikeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<LikeEntity, LikeId> {
}
