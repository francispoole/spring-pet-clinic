package com.francispoole.springpetclinic.repositories;

import com.francispoole.springpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Specialty, Long> {
}
