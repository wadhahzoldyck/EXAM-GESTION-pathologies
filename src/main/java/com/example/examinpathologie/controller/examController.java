package com.example.examinpathologie.controller;


import com.example.examinpathologie.entities.Pathologie;
import com.example.examinpathologie.entities.Patient;
import com.example.examinpathologie.services.IserviceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("exam")
@RequiredArgsConstructor
public class examController {

    private final IserviceImp iserviceImp ;
@PostMapping("addPathologie")
public Pathologie ajouterPathologie(@RequestBody Pathologie path) {
    return iserviceImp.ajouterPathologie(path);
}
@PostMapping("ajouterPatient/{codePath}")
public Patient ajouterPatientEtAffecterAPathologie(@RequestBody Patient p, @PathVariable String codePath){
   return iserviceImp.ajouterPatientEtAffecterAPathologie(p,codePath);
}
}
