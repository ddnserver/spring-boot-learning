package com.greeting_app;

import com.greeting_app.controller.GreetingController;

public class Main {

    public static void main(String[] args) {
        GreetingController controller = new GreetingController();
        
        // Simulate GET request
        System.out.println("=== GET Request ===");
        controller.getGreeting();

        // Simulate POST request

        System.out.println("\n=== POST Request ===");
        controller.postGreeting("Lalit g3");

        // Fetch again after POST
        controller.getGreeting();
    }
}