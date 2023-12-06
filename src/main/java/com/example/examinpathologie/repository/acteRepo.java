package com.example.examinpathologie.repository;

import com.example.examinpathologie.entities.Acte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface acteRepo extends JpaRepository <Acte , Long> {
}
