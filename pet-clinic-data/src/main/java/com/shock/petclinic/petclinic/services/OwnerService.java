package com.shock.petclinic.petclinic.services;

import com.shock.petclinic.petclinic.model.Owner;
import com.shock.petclinic.petclinic.model.Pet;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Owner save(Pet pet);
    Set<Owner> findAll();
}
