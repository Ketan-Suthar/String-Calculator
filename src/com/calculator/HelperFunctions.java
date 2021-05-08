package com.calculator;

/*
 * class for all helper function
 * so we can use this functions anywhere in project
 */
public class HelperFunctions
{
	// check if given string is null or empty 
	public static boolean isNullOrEmpty(String string)
	{
		return (string == null || string.isEmpty()) ? true : false;
	}
	
	// convert given integer value as string to integer
	public static int getIntegerValue(String number)
	{
		// if string does contain characters other than digit parseDouble method will
		// throw exception so in that case return 0 else return integer value of that
		// number
		try
		{
			// return 0 for null
			return number != null ? (int)Double.parseDouble(number.toString()) : 0;
		}
		catch(NumberFormatException e)
		{
			return 0;
		}
	}
	
	// splitStirng method will return array of string from given string
	// it will split string based on given delimiter
	// ex. "1,2,3" -> {"1", "2", "3"} where comma is delimiter
	public static String[] splitStirng(String string, String delimiter)
	{
		return string.split(delimiter);
	}
}
