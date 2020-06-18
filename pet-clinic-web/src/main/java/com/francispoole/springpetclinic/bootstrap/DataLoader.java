package com.francispoole.springpetclinic.bootstrap;

import com.francispoole.springpetclinic.model.Owner;
import com.francispoole.springpetclinic.model.Pet;
import com.francispoole.springpetclinic.model.PetType;
import com.francispoole.springpetclinic.model.Vet;
import com.francispoole.springpetclinic.services.OwnerService;
import com.francispoole.springpetclinic.services.PetTypeService;
import com.francispoole.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        System.out.println("Loaded pet types...");

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("Gray road");
        owner1.setCity("New York");
        owner1.setTelephone("123123123");

        Pet pet1 = new Pet();
        pet1.setName("Rosco");
        pet1.setPetType(savedDogPetType);
        pet1.setOwner(owner1);
        pet1.setBirthDate(LocalDate.now());
        owner1.getPets().add(pet1);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Dilly");
        owner2.setLastName("Dunk");
        owner1.setAddress("Mothers Square");
        owner1.setCity("London");
        owner1.setTelephone("1234567890");

        Pet pet2= new Pet();
        pet2.setName("Fluffy");
        pet2.setPetType(savedCatPetType);
        pet2.setOwner(owner2);
        pet2.setBirthDate(LocalDate.now());
        owner2.getPets().add(pet2);

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Francis");
        vet1.setLastName("Poole");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Sam");
        vet2.setLastName("Axe");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
