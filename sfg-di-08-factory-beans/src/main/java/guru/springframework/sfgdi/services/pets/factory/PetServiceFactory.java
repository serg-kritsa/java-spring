package guru.springframework.sfgdi.services.pets.factory;

import guru.springframework.sfgdi.services.pets.PetService;
import guru.springframework.sfgdi.services.pets.impl.DogPetService;
import guru.springframework.sfgdi.services.pets.impl.CatPetService;

public class PetServiceFactory {

    public PetService getPetService(String petType){
        switch (petType){
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
