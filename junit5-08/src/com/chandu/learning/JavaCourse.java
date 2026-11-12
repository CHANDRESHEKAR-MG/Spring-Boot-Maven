package com.chandu.learning;

public class JavaCourse implements Course {

    @Override
    public boolean buyCourse() {
        System.out.println("Java course purchased");
        return true;
    }
}