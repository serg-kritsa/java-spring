package guru.springframework.sfgdi.services.pets.impl;

import guru.springframework.sfgdi.services.pets.PetService;

public class DogPetService implements PetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}
