package com.example.FukuFuku_Backend_Spring.Repository;

import com.example.FukuFuku_Backend_Spring.entity.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<TagEntity, Long> {
}
