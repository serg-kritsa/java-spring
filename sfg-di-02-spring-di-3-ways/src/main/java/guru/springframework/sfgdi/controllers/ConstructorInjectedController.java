package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService; // 1) declaration

    // 2) initialization
    // @Autowired NOT required here
    public ConstructorInjectedController(GreetingService greetingService) {
        // constructor dependency injection
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting(); // usage
    }
}