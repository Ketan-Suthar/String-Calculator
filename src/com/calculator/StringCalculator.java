package com.calculator;

public class StringCalculator {
	
	/*
	 * add method takes list of number as string(comma separated values)
	 * and return sum of all number
	 */
	public int Add(String numbers)
	{
		int sum = 0; // to store sum of passed numbers
		// if numbers string is null or empty than return 0
		if(HelperFunctions.isNullOrEmpty(numbers))
			return sum;
		
		// numbers may contain comma and \n as delimiter, first convert all \n
		// to comma so that we can split string based on comma in just one go
		numbers = numbers.replaceAll("\\n", ",");
		
		// now first split the numbers string based on comma(',') and store them
		String[] numbersInInt = HelperFunctions.splitStirng(numbers, ",");
		
		// go through each number, convert them to integer and add them to sum
		for(String number: numbersInInt)
			sum += HelperFunctions.getIntegerValue(number);
		
		return sum;
	}
}
