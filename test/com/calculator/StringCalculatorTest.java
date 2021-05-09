package com.calculator;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

/*
 * this is junit test class for StringCalculator created in src
 * we can perform unit testing unit Junit for each method in StringCalculator
 */
public class StringCalculatorTest {
	StringCalculator stringCalculator = new StringCalculator();
	
	
	//  test cases for numbers with delimiter of any length
	@Test
	public void sumOfNumbersWithMultipleDelimiterOfMultipleLength() {
		assertEquals(1007, stringCalculator.Add("//[***][~~]\n1***2~~3~~1000"));
		assertEquals(10, stringCalculator.Add("//[,,][%%]\n1,,2%%3,,4"));
		assertEquals(155, stringCalculator.Add("//[~~~~]\n111~~~~34~~~~10"));
		assertEquals(10, stringCalculator.Add("//[&&&&][!!!!!]\n1&&&&2!!!!!3&&&&4"));
	}
	
	// test case for empty and null string
	
//	@Test
//	public void sumOfEmptyString() {
//		assertEquals(0, stringCalculator.Add(""));
//		assertEquals(0, stringCalculator.Add(null));
//	}
//	
//	// test cases for single number
//	@Test
//	public void sumOfOneNumber() {
//		assertEquals(1, stringCalculator.Add("1"));
//		assertEquals(123, stringCalculator.Add("123"));
//		assertEquals(99, stringCalculator.Add("99"));
//	}
//	
//	// test cases for two numbers
//	@Test
//	public void sumOfTwoNumbers() {
//		assertEquals(3, stringCalculator.Add("1,2"));
//		assertEquals(15, stringCalculator.Add("7,8"));
//		assertEquals(199, stringCalculator.Add("99,100"));
//	}	
//	
//	// test cases for multiple numbers
//	@Test
//	public void sumOfMultipleNumbers() {
//		assertEquals(6, stringCalculator.Add("1,2,3"));
//		assertEquals(55, stringCalculator.Add("1,2,3,4,5,6,7,8,9,10"));
//		assertEquals(52, stringCalculator.Add("13,13,13,13"));
//	}
//	
//	// test cases for number with comma and \n as delimiter
//	@Test
//	public void sumOfNumbersWithNewlineAndComma() {
//		assertEquals(6, stringCalculator.Add("1,2,3"));
//		assertEquals(55, stringCalculator.Add("1,2,3,4\n5,6,7\n8,9\n10"));
//		assertEquals(52, stringCalculator.Add("13\n13,13\n13"));
//		assertEquals(111, stringCalculator.Add("111\n1111\n11111"));
//	}
//	
//	// test cases for number with comma and \n as delimiter
//	@Test
//	public void sumOfNumbersWithDifferentDelimiters() {
//		// case with default delimiter
//		assertEquals(6, stringCalculator.Add("1,2,3"));
//		// cases with different delimiters specified in begging of the string
//		assertEquals(55, stringCalculator.Add("//;\n1;2;3;4;5;6;7;8;9;10"));
//		assertEquals(52, stringCalculator.Add("//@\n13@13@13@13"));
//		assertEquals(111, stringCalculator.Add("//~\n111~1111~11111"));
//	}
//	
//	// test cases for number with comma and \n as delimiter
//	@Test
//	public void sumOfNumbersWithSingleNegativeNumber() {
//		// if there negative number is passed then Add method should return 0
//		assertEquals(0, stringCalculator.Add("1,-2,3"));
//		assertEquals(0, stringCalculator.Add("1,2,3,4\n5,6,7\n8,9\n-10"));
//		assertEquals(0, stringCalculator.Add("//~\n111~-34~11111"));
//	}
//	
//	// test cases for number with comma and \n as delimiter
//	@Test
//	public void sumOfNumbersWithMultipleNegativeNumber() {
//		// if there negative number is passed then Add method should return 0
//		assertEquals(0, stringCalculator.Add("-1,-2,3"));
//		assertEquals(0, stringCalculator.Add("-1,2,-3,4\n5,-6,7\n8,9\n-10"));
//		assertEquals(0, stringCalculator.Add("//~\n-111~-34~-11111"));
//	}
//	
//	@AfterClass
//	public static void numberOfTimeAddCalledAfterAllMethodCall() {
//		System.out.println("\n@AfterClass method checking how many times Add method called in testing");
//		assertEquals(31, StringCalculator.GetCalledCount());
//	}
//	
//	//  test cases for numbers which contains some numbers grater than 1000
//	@Test
//	public void sumOfNumbersWithGreaterThan1000() {
//		// if there negative number is passed then Add method should return 0
//		assertEquals(1006, stringCalculator.Add("1,2,3,1000"));
//		assertEquals(55, stringCalculator.Add("1,2,3,4\n5,6,7\n8,9\n10,1001,2000,3000,4000"));
//		assertEquals(145, stringCalculator.Add("//~\n111~34~11111~90992~1414~1141~8763"));
//	}
//	
//	
//	//  test cases for numbers with delimiter of any length
//	@Test
//	public void sumOfNumbersWithDelimiterOfAnyLength() {
//		assertEquals(1006, stringCalculator.Add("//[***]\n1***2***3***1000"));
//		assertEquals(10, stringCalculator.Add("//[,,,]\n1,,,2,,,3,,,4"));
//		assertEquals(155, stringCalculator.Add("//[~~~~~~]\n111~~~~~~34~~~~~~10"));
//	}
//	
//	//  test cases for numbers with delimiter of any length
//	@Test
//	public void sumOfNumbersWithMultipleDelimiterOfSingleLength() {
//		assertEquals(1006, stringCalculator.Add("//[*][~]\n1*2~3~1000"));
//		assertEquals(10, stringCalculator.Add("//[,][%]\n1,2%3,4"));
//		assertEquals(155, stringCalculator.Add("//[~]\n111~34~10"));
//	}
}
