package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.pets.PetService;
import guru.springframework.sfgdi.services.pets.impl.DogPetService;
import guru.springframework.sfgdi.services.pets.impl.CatPetService;
import guru.springframework.sfgdi.services.pets.factory.PetServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory){
       return petServiceFactory.getPetService("dog");
    }

    @Bean
    @Profile("cat")
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }
}
