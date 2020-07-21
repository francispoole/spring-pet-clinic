package com.francispoole.springpetclinic.repositories;

import com.francispoole.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
