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
public class Acte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idActe ;
    String codeActe ;
    int cotationActe ;
    float prixUnitaireActe ;
    String designationActe ;

    @ManyToOne
    Patient patient ;

    @ManyToMany(mappedBy = "actes")
    List<Pathologie> pathologies ;
}
