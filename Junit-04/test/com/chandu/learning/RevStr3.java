package com.chandu.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RevStrTest3 {

    @Test
    void testReverseString_oneword() {

        ReverseString3 rev2 = new ReverseString3();

        assertEquals("avaj", rev2.reverse("java"));
    }

    @Test
    void testReverseString_Multipleword() {

        ReverseString3 rev3 = new ReverseString3();

        assertEquals("si", rev3.reverse("is"));
    }
}