package com.francispoole.springpetclinic.services.springdatajpa;

import com.francispoole.springpetclinic.model.Specialty;
import com.francispoole.springpetclinic.repositories.SpecialityRepository;
import com.francispoole.springpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtyServiceSDJpa implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialtyServiceSDJpa(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        specialityRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Specialty findById(Long id) {
        return specialityRepository.findById(id).orElse(null);
    }

    @Override
    public Specialty save(Specialty specialty) {
        return specialityRepository.save(specialty);
    }

    @Override
    public void delete(Specialty specialty) {
        specialityRepository.delete(specialty);
    }

    @Override
    public void deleteById(Long id) {
        specialityRepository.deleteById(id);
    }
}
