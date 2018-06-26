package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello(){
        return getGreetingService().sayGreeting();
    }
    public GreetingService getGreetingService(){
        return  greetingService;
    }
}
