package com.greeting_app.controller;

import com.greeting_app.model.Greeting;
import com.greeting_app.service.GreetingServiceImpl;
import com.greeting_app.service.GreetingService;
import com.greeting_app.anotation.MyAnnotation;

public class GreetingController {
    private GreetingService greetingService;

    public GreetingController() {
        this.greetingService = new GreetingServiceImpl();
    }

    @MyAnnotation(author = "Lalit", version = 1)
    public void getGreeting() {
        Greeting greeting = greetingService.getGreeting();
        System.out.println("Greeting Message: " + greeting.getMessage());
    }

    @MyAnnotation(author = "Lalit", version = 1)
    public void postGreeting(String name) {
        greetingService.postGreeting(name);
        System.out.println("Posted new greeting for: " + name);
    }
}