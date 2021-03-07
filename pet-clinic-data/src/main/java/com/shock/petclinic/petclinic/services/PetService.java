package com.shock.petclinic.petclinic.services;

import com.shock.petclinic.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
