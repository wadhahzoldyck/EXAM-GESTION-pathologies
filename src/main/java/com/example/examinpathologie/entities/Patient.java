package com.example.examinpathologie.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idPatient ;
    @Enumerated(EnumType.STRING)
    TypePieceIdentite typePieceIdentite;
    String identifiantPieceIdentite ;
    LocalDate dateEmission ;
    String nomP ;
    String prenomP ;

    @OneToMany(mappedBy = "patient")
    List<Acte> act ;

    @ManyToMany
    List<Pathologie> pathologies ;
}
