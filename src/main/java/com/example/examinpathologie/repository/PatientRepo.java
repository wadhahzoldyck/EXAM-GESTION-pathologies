package com.example.examinpathologie.repository;

import com.example.examinpathologie.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient, Long> {
}
