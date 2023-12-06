package com.example.examinpathologie.services;


import com.example.examinpathologie.entities.FamilleActe;
import com.example.examinpathologie.entities.Pathologie;
import com.example.examinpathologie.entities.Patient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


public interface Iservice {

    public Pathologie ajouterPathologie(Pathologie path);
    public Patient ajouterPatientEtAffecterAPathologie(Patient p, String codePath);
   public FamilleActe ajouterFamilleActeEtActeAssocie(FamilleActe facte);

}
