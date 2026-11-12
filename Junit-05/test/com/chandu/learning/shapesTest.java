package com.chandu.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.chandu.learning.shapes;

class shapesTest {
	shapes shape =new shapes();
	@Test
	final void testComputeSqArea() 
	{
		//shapes shape =new shapes();
		assertEquals(576,shape.computeSqArea(24));
		
		assertEquals(78.5,shape.computeSqAreaOfcircle(5),"Area of circle calculation is wrong");
		
		
	}
	@Test
	void computeSqAreaOfcirle_Supplier() { 
		assertEquals(78.5,shape.computeSqAreaOfcircle(5),()->"Area of circle calculation is wrong");
		
		
	}

}
