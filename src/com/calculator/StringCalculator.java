package com.calculator;

public class StringCalculator {
	
	/*
	 * add method takes list of number as string(comma separated values)
	 * and return sum of all number
	 */
	int timeAddCalled = 0;
	
	public int Add(String numbers)
	{
		++timeAddCalled;
		int sum = 0; // to store sum of passed numbers
		// if numbers string is null or empty than return 0
		if(HelperFunctions.isNullOrEmpty(numbers))
			return sum;
		
		// numbers may contain comma and \n as delimiter, first convert all \n
		// to comma so that we can split string based on comma in just one go
		
		// setting default delimiter as comma
		String delimiter = ",|\n";
		
		/*
		 * numbers string is separated by delimiter D
		 * D is the delimiter in starting of the string after double slash (//D)
		 * and numbers start from the next line separated by delimeter D
		 * example //[delimiter]\n[numbers…]
		 * like: //;\n1;2
		 * 
		 * so first check if delimiter is specified in the numbers or not
		 */
		if(numbers.matches("//(.*)\n(.*)")){
			// if delimiter is specified in starting of the string 
			// set the new value of delimiter
			delimiter = Character.toString(numbers.charAt(2));
			delimiter = delimiter + "|\n";
			// now we only need the numbers starting from the new line 
			// from the 4th character after //D\n
			numbers = numbers.substring(4);
		}

		// now first split the numbers string based on delimiter
		String[] numbersInInt = HelperFunctions.splitStirng(numbers, delimiter);
		
		// to stores all negative number
		String negativeNumbers = "";
		
		// go through each number, convert them to integer and add them to sum
		for(String number: numbersInInt)
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
	
	public int GetCalledCount()
	{
		return timeAddCalled;
	}
}
