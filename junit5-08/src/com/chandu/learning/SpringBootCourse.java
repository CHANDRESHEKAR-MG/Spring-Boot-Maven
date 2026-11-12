package com.chandu.learning;

public class SpringBootCourse implements Course {

    @Override
    public boolean buyCourse() {
        System.out.println("Spring Boot course purchased");
        return true;
    }
}