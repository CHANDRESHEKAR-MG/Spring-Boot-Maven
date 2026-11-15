package com.chandi;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArrayJunitCheck {

	@Test
	final void testArray() {
		int [] expected = {2,4,6,7};
		int [] actual= {4,2,7,6};	
		Arrays.sort(actual);
		//assertEquals(actual,expected);// checking referrnce variable not the data inside this heap memory.
		//here 2 separate heap memory has created for 2 separate array so here assertEquals checking reference variable not the data 
		//for to cjheck data
		
		assertArrayEquals(actual,expected);//it checks data 
		}
	
	@Test
	void checkArray (){
		 //test case will fail if there is no exception here fail function is used to make the test case fail
		//tst case is pass if there is exception
		try {
		ArrayCheck array = new ArrayCheck();
		int unsortedArray[]= {2,1,4,9};
		int sortedArray[]=array.sortArray(unsortedArray);
		for(int elem:sortedArray) {
			System.out.println(elem);
		}
		System.out.println("Statement below exception");
		
		
		//fail();//fails test case  
		}
		catch(NullPointerException e) {
			System.out.println("null pointer exception");
		}

}
	@Test
	void ArrayTimeout() {
		ArrayCheck arr = new ArrayCheck();
		int unsort[]= {4,5,8,7};
		assertTimeout(Duration.ofMillis(10), ()-> arr.sortArray(unsort));
		//means here in main java file we written  for loop from 1 to 100000 time so here we are checking is that to possible to complete task with in this time by passing different times
		//like if i choose 1 ms here not possible to iterate 1lack tikes but if i give 100 it complte all ie=terations
		
	}
}
