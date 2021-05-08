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
}
