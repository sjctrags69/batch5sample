package org.ssglobal.training.codes.itemI;

public class FahrenheitToCelsiusx {
	
	public static void main(String [] args) {
		// declare and initialize data
		/*Celsius and Fahrenheit should be declared as double */
		float Celsius = 35.5;
		float Fahrenheit = 22.6;
		// calculate celsius equivalent
		/*using the same variable name for a different use
		 *fahrenheit was not declared
		 *calculation should go as (fahrenheit - 32) * 5 / 9*/
		double celsius = (5/9) * fahrenheit - 32;
		// output results
		/*the use of the formatting for float is invalid*/
		System.out.println( fahrenheit, "\U00B0F = " );
		/*celsius was spelled incorrectly
		 *formatting is incorrect*/
		System.out.println( celcius, "u00B0C" );
		}
}
