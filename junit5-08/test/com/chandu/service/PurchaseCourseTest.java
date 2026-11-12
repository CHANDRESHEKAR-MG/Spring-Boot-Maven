package com.chandu.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.chandu.learning.*;
public class PurchaseCourseTest {

    @Test
    public void testJavaCourse() {

        JavaCourse java = new JavaCourse();

        PurchaseCourse pc = new PurchaseCourse(java);  

        assertTrue(pc.purchase());
    }

    @Test
    public void testJunitCourse() {

        JunitCourse junit = new JunitCourse();

        PurchaseCourse pc = new PurchaseCourse(junit);

        assertTrue(pc.purchase());
    }

    @Test
    public void testSpringBootCourse() {

        SpringBootCourse spring = new SpringBootCourse();

        PurchaseCourse pc = new PurchaseCourse(spring);

        assertTrue(pc.purchase());
    }
}