package com.chandu.SpringBootMavenApp.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {

    @Override
    public String generateGreeting() {

        // System.out.println("Chandu learning");

        LocalTime time = LocalTime.now();
        int hour = time.getHour();

        if (hour >= 5 && hour < 12)
            return "Good Morning - Chandu is learning";

        else if (hour >= 12 && hour < 16)
            return "Good Afternoon - Chandu is learning";

        else if (hour >= 16 && hour < 20)
            return "Good Evening - Chandu iis learning";

        else
            return "Good Night - Chandu iis learning";
    }
}