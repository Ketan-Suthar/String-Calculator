package com.calculator;

public class StringCalculator {
	
	// to stored how many times Add method is called
	static int timesAddCalled = 0;
	public StringCalculator()
	{
		// just wanted to check how many time Junit is creating contructor
		// System.out.println("\nStringCalculator: Default contructor called");
	}
	/*
	 * add method takes list of number as string(comma separated values)
	 * and return sum of all number
	 */
	public int Add(String numbers)
	{
		// each time Add method is called increament the count
		++timesAddCalled;
		int sum = 0; // to store sum of passed numbers
		// if numbers string is null or empty than return 0
		if(HelperFunctions.isNullOrEmpty(numbers))
			return sum;
	
		String[] splitedNummber = {};
		
		// if numbers start with // then we need to extract delimiter 
		if(numbers.startsWith("//"))
		{
			// findDelimiter will return delimiter from given string
			// which must start from // and delimiter should be in bracket []
			splitedNummber = getNumbers(numbers);
		}
		else
			splitedNummber = HelperFunctions.splitStirng(numbers, ",|\n");
		System.out.println("\nnumbers: " + numbers);
		// to stores all negative number
		String negativeNumbers = "";
		
		// go through each number, convert them to integer and add them to sum
		for(String number: splitedNummber)
		{	
			// convert current number from string to integer, so we can add it to sum 
			int currentNumber = HelperFunctions.getIntegerValue(number);
			// checking if currnetNumber is negative or not
			if(currentNumber < 0)
			{
				// if no negative number has been encountered till now then simply assign it to negativeNumbers
				// other wise add current number to negativeNumbers separated using comma
				negativeNumbers += HelperFunctions.isNullOrEmpty(negativeNumbers) ? 
						number : "," + number;
			}
			else if(currentNumber > 1000)
				continue;
			sum += currentNumber;
		}
		// if negativeNumbers is not empty then, raise the exception and return 0
		try {
			// negativeNumbers is not empty then we there must be at least one negative number in numbeers passed
			if(!HelperFunctions.isNullOrEmpty(negativeNumbers))
				throw new Exception("negatives not allowed: " + negativeNumbers);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0; // Returning 0 because be encountered negative numbers
		}
		// if numbers not contains any negative number then just return the sum of numbers
		return sum;
	}
	
	public String[] getNumbers(String numbers)
	{
		//NOTE: SINCE WE ARE IN THIS FUNCTION WE ARE SURE THAR NUMBERS CONTAIN CUSTOME DELIMITER
		
		String delimiter = ""; // to store the delimiter
		
		// since delimiter can be of any length we need to find starting position from where numbers will start
		int numbersStartFrom = 0;
		
		/*
		 * numbers string is separated by delimiter D (D is fixed char but with any length)
		 * D is the delimiter in starting of the string after double slash (//[D])
		 * and numbers start from the next line separated by delimiter D
		 * example //[delimiter]\n[numbers…]
		 * like: //[***]\n1***2
		 * or like //;\n1;2
		 *
		 * so delimiter simply can be of 1 length or multiple length but in square braces
		 */
		// character at 3rd position is [ we're need to loop through it to check how many characters delimiter has
		if(numbers.charAt(2) == '[')
		{
			int index = 2;
			while(numbers.charAt(index) == '[')
			{
				String currentDelimiter = "";
				for(; numbers.charAt(index) == ']' ; ++index, numbersStartFrom = index)
				{
					String character = Character.toString(numbers.charAt(index+1));
					if(character.equals("+") || character.equals("*") || character.equals("^"))
						character = "\\" + character;
					currentDelimiter += character;
				}
				delimiter += HelperFunctions.isNullOrEmpty(delimiter) ? currentDelimiter : 
					("|" + currentDelimiter);
			}
			// since numbers will start after newline after ending of the delimiter list we need to
			// Increment numbersStartFrom by 2
			numbersStartFrom+=2;
		}
		else
		{
			// if character at 3rd position is not [ then, it only contains single length delimiter
			delimiter = Character.toString(numbers.charAt(2));
			numbersStartFrom = 4;
		}
		// apart from delimiter we are making sure that number can also be in newlines 
		delimiter = delimiter + "|\n";
		
		System.out.println("\ndelimiter: " + delimiter);
		System.out.println("\nnumbersStartFrom: " + numbersStartFrom);
		
		// actual numbers start from first after delimiter specification which are storing in numbersStartFrom
		numbers = numbers.substring(numbersStartFrom);

		System.out.println("\nnumbers: " + numbers);
		// now we have numbers and delimiter just numbers using delimiter and return
		String[] splitedNummber = HelperFunctions.splitStirng(numbers, delimiter);
		return splitedNummber;
	}
	
	// to get the numbers of the time Add method is called
	public static int GetCalledCount()
	{
		return timesAddCalled;
	}
}
