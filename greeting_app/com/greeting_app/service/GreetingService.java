package com.greeting_app.service;

import com.greeting_app.model.Greeting;

public interface GreetingService {
    Greeting getGreeting();
    void postGreeting(String name);
}
