package guru.springframework.sfgdi.services.pets.impl;

import guru.springframework.sfgdi.services.pets.PetService;

public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
