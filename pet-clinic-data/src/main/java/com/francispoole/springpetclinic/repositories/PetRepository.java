package com.francispoole.springpetclinic.repositories;

import com.francispoole.springpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
