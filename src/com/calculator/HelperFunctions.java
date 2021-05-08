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
	
	public static int getIntegerValue(String number)
	{
		try
		{
			return number != null ? (int)Double.parseDouble(number.toString()) : 0;
		}
		catch(NumberFormatException e)
		{
			return 0;
		}
	}
}
