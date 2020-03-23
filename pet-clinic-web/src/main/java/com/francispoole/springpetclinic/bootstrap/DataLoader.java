package com.francispoole.springpetclinic.bootstrap;

import com.francispoole.springpetclinic.model.Owner;
import com.francispoole.springpetclinic.model.Vet;
import com.francispoole.springpetclinic.services.OwnerService;
import com.francispoole.springpetclinic.services.VetService;
import com.francispoole.springpetclinic.services.map.OwnerServiceMap;
import com.francispoole.springpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Dilly");
        owner2.setLastName("Dunk");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Francis");
        vet1.setLastName("Poole");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Sam");
        vet2.setLastName("Axe");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
