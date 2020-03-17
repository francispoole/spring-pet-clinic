package com.francispoole.springpetclinic.services;

import com.francispoole.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
