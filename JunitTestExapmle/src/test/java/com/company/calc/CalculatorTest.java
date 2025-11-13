package com.company.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	
	
	
	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		int expectedOut = 11;
		
		System.out.println("Test running");

		int actualResult = cal.add(5, 6);
		assertEquals(expectedOut, actualResult);
	}
	
	@Test
	public void testSubtract() {
		Calculator cal = new Calculator();
		int expectedOut = 2;
		
		System.out.println("Test running");

		int actualResult = cal.subtract(6, 4);
		assertEquals(expectedOut, actualResult);
	}
	

}
