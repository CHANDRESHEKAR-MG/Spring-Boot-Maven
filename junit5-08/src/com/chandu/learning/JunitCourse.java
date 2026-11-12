package com.chandu.learning;

public class JunitCourse implements Course {

    @Override
    public boolean buyCourse() {
        System.out.println("JUnit course purchased");
        return true;
    }
}