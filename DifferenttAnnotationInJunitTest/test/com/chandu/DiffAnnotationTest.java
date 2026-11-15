package com.chandu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS) //constructer will executte only  once otherwise it will execute numberr of times the instance will we create
//here the testInstance Annotation will execute only once in every class 
class DiffAnnotationTest {
	DiffAnnotation shape =new DiffAnnotation();
	
	DiffAnnotationTest(){
		System.out.println("Test obj is created vefore test method");
		// when we create obj that many time it will execute here 3 time i have created obj in differnet methods
		
	}
	
	
	
	
	//here @BeforeEach Annotation do this Annotation will execute before the Every Othet@Test Annotation Executte 
	//here i have 2 @test method so @ time BeforeEsch Annotation will execute 
	//output is liks
//	Before each Annotation in JUNIT 5 TESTING
//	Actual test 3
//	Before each Annotation in JUNIT 5 TESTING
//	Actual test test 2
//	Before each Annotation in JUNIT 5 TESTING
//	Actual test 1

	@BeforeEach
	//mainly for to test one common method or function after every test 
	
		void init() {
			System.out.println("Before each Annotation in JUNIT 5 TESTING");
		
	}
	@BeforeAll
	//it will execue before other test to execute only once
	
	static void BeforeAll(){
		System.out.println("Before All it will execute");
		
	}
	@Test 
	void computeSqArea() {
		
		assertEquals(576,shape.computeSqArea1(24));
		System.out.println("Actual test 1");
		
		
	}
@Test
void check() {
	assertEquals(6,6);
	System.out.println("Actual test test 2");
}
@Test
void check2() {
	assertEquals(6,6);
	System.out.println("Actual test 3");
}
@AfterEach
void destroy() { //it is vice versa of BeforeEach test
	//@AfterEach annotation executes after every individual @Test method.
	
	System.out.println("After each Annotation in JUNIT 5 TESTING");
	//mainly after test to clean up 

}
@AfterAll
//it will execue afterr all other test to execute oanly oce 

static void AfterAll(){
	System.out.println("After executing all test it  will execute");
	
}
}
