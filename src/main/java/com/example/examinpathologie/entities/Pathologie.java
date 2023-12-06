package com.example.examinpathologie.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pathologie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idPath ;
    String codePath ;
    String libelle ;
    String description ;
    Boolean archive ;

    @ManyToMany
    List<Acte> actes ;
}
