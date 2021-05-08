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
	
	// test cases for two numbers
	@Test
	public void sumOfTwoNumbers() {
		assertEquals(3, stringCalculator.Add("1,2"));
		assertEquals(15, stringCalculator.Add("7,8"));
		assertEquals(199, stringCalculator.Add("99,100"));
	}	
	
	// test cases for multiple numbers
	@Test
	public void sumOfMultipleNumbers() {
		assertEquals(6, stringCalculator.Add("1,2,3"));
		assertEquals(55, stringCalculator.Add("1,2,3,4,5,6,7,8,9,10"));
		assertEquals(52, stringCalculator.Add("13,13,13,13"));
		assertEquals(12333, stringCalculator.Add("111,1111,11111"));
	}
	
	// test cases for number with comma and \n as delimiter
	@Test
	public void sumOfNumbersWithNewlineAndComma() {
		assertEquals(6, stringCalculator.Add("1,2,3"));
		assertEquals(55, stringCalculator.Add("1,2,3,4\n5,6,7\n8,9\n10"));
		assertEquals(52, stringCalculator.Add("13\n13,13\n13"));
		assertEquals(12333, stringCalculator.Add("111\n1111\n11111"));
	}
	
	// test cases for number with comma and \n as delimiter
	@Test
	public void sumOfNumbersWithDifferentDelimiters() {
		// case with default delimiter
		assertEquals(6, stringCalculator.Add("1,2,3"));
		// cases with different delimiters specified in begging of the string
		assertEquals(55, stringCalculator.Add("//;\n1;2;3;4;5;6;7;8;9;10"));
		assertEquals(52, stringCalculator.Add("//@\n13@13@13@13"));
		assertEquals(12333, stringCalculator.Add("//~\n111~1111~11111"));
	}
}
