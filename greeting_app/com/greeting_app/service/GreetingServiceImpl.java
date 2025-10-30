package com.greeting_app.service;

import com.greeting_app.model.Greeting;

public class GreetingServiceImpl implements GreetingService {
    private Greeting currentGreeting;

    public GreetingServiceImpl() {
        this.currentGreeting = new Greeting("Hello, World!");
    }

    @Override
    public Greeting getGreeting() {
        return currentGreeting;
    }

    @Override
    public void postGreeting(String name) {
        this.currentGreeting.setMessage("Hello, " + name + "!");
    }
}