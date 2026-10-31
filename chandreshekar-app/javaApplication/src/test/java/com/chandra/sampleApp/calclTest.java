package com.chandra.sampleApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.chandra.sampleaApp.Calculation;

public class calclTest {
	@Test
	void testcalc() {
		Calculation cal = new Calculation();
		int actualResult=cal.divide(10,5);
		int expectedResult=2;
		int actualResult1=cal.divide(10,5);
		int expectedResult1=4;
		
		assertEquals(expectedResult,actualResult);
		assertEquals(expectedResult1,actualResult1);

	}
}
