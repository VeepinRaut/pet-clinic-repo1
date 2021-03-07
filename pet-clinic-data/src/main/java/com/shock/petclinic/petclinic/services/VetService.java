package com.shock.petclinic.petclinic.services;

import com.shock.petclinic.petclinic.model.Pet;
import com.shock.petclinic.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
