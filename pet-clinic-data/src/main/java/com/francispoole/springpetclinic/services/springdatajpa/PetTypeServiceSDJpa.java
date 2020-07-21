package com.francispoole.springpetclinic.services.springdatajpa;

import com.francispoole.springpetclinic.model.PetType;
import com.francispoole.springpetclinic.repositories.PetTypeRepository;
import com.francispoole.springpetclinic.services.PetTypeService;

import java.util.HashSet;
import java.util.Set;

public class PetTypeServiceSDJpa implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeServiceSDJpa(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType petType) {
        return petTypeRepository.save(petType);
    }

    @Override
    public void delete(PetType petType) {
        petTypeRepository.delete(petType);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}
