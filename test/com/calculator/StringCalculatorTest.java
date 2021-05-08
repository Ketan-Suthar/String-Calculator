package com.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * this is junit test class for StringCalculator created in src
 * we can perform unit testing unit Junit for each method in StringCalculator
 */
public class StringCalculatorTest {
	StringCalculator stringCalculator = new StringCalculator();
	
	// test case for empty and null string
	@Test
	public void sumOfEmptyString() {
		assertEquals(0, stringCalculator.Add(""));
		assertEquals(0, stringCalculator.Add(null));
	}
	
	// test cases for single number
	@Test
	public void sumOfOneNumber() {
		assertEquals(1, stringCalculator.Add("1"));
		assertEquals(123, stringCalculator.Add("123"));
		assertEquals(99, stringCalculator.Add("99"));
	}
}
