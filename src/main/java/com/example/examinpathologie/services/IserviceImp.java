package com.example.examinpathologie.services;


import com.example.examinpathologie.entities.Acte;
import com.example.examinpathologie.entities.FamilleActe;
import com.example.examinpathologie.entities.Pathologie;
import com.example.examinpathologie.entities.Patient;
import com.example.examinpathologie.repository.FamilleActeRepo;
import com.example.examinpathologie.repository.PathologieRepo;
import com.example.examinpathologie.repository.PatientRepo;
import com.example.examinpathologie.repository.acteRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class IserviceImp implements Iservice {

    private final PathologieRepo pathologieRepo;
    private final PatientRepo patientRepo;
    private final FamilleActeRepo familleActeRepo;
    private final acteRepo acteRepo;

    @Override
    public Pathologie ajouterPathologie(Pathologie path) {
        path.setArchive(false);
        return pathologieRepo.save(path);
    }

    @Override
    public Patient ajouterPatientEtAffecterAPathologie(Patient p, String codePath) {
        Pathologie patho = pathologieRepo.findPathologieByCodePath(codePath);
        if (p.getPathologies() == null) {
            List<Pathologie> pathologies = new ArrayList<>();
            pathologies.add(patho);
            p.setPathologies(pathologies);
        } else {
            p.getPathologies().add(patho);
        }
        patientRepo.save(p);

        return p;
    }

    @Override
    public FamilleActe ajouterFamilleActeEtActeAssocie(FamilleActe facte) {
       FamilleActe fa= familleActeRepo.save(facte) ;
       List<Acte> a = facte.getActes() ;

       for(Acte i :a ){
           i.setFamilleact(fa);
           acteRepo.save(i);
       }
       return fa ;



}}