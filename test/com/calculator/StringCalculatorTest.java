package com.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * this is junit test class for StringCalculator created in src
 * we can perform unit testing unit Junit for each method in StringCalculator
 */
public class StringCalculatorTest {
	StringCalculator stringCalculator = new StringCalculator();
	
	@Test
	public void sumOfEmptyString() {
		assertEquals(0, stringCalculator.Add(""));
	}
}
