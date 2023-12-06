package com.example.examinpathologie.repository;

import com.example.examinpathologie.entities.Pathologie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PathologieRepo extends JpaRepository<Pathologie, Long> {
}
