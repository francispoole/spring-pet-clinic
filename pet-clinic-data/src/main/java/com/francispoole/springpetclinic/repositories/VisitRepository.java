package com.francispoole.springpetclinic.repositories;

import com.francispoole.springpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
