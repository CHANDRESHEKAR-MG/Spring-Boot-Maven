package com.chandu.service;

import com.chandu.learning.Course;

public class PurchaseCourse {

    private Course course;

    public PurchaseCourse(Course course) {
        this.course = course;
    }

    public boolean purchase() {
        return course.buyCourse();
    }
}