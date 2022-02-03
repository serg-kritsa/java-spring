package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService; // 1) declaration

    @Autowired // 2) initialization.
    public void setGreetingService(GreetingService greetingService) {
        // setter dependency injection
        // using this if names are the same name
        this.greetingService = greetingService;
    }
    @Autowired // 2) initialization
    public void setGreetingService(GreetingService greetingServiceFromParam) {
        greetingService = greetingServiceFromParam;
    }

    public String getGreeting(){
        return greetingService.sayGreeting(); // usage
    }
}
