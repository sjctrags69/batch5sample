package org.ssglobal.training.codes.itemA;
//code 3
public class Temperature {
	
	public static void main(String[] args) {
		double tempF = 98.6, tempC = 0.0;
		fahrToCel(tempF, tempC);
		System.out.println("Body temperature in Celsius is: " + tempC);
	}
	// Converts Fahrenheit temperatures to Celsius.
	public static void fahrToCel(double tempF, double tempC) {
		tempC = (tempF - 32) * 5 / 9;
	}
}
