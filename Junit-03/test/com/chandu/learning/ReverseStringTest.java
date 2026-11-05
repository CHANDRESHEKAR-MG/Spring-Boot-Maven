package com.chandu.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	final void test() {
		ReverseString2 str = new ReverseString2();
		assertEquals("avaj",str.reverse("java"));
		assertEquals("ABC",str.reverse("CBA")); 
		assertEquals("avaj",str.reverse("javaa"));
		 assertEquals("wrong", str.reverse("java"));
		
		
		
		
	}


}
