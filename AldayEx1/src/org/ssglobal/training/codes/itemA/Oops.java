package org.ssglobal.training.codes.itemA;
//code 1
public class Oops {
	
	public static void main(String[] args) {
		int a = 7, b = 42;
		int smaller = minimum(a, b);
		if (smaller == a) {
			System.out.println("a is the smallest!");
		} else {
			System.out.println("b is the smallest!");
	}
}
	
public static int minimum(int a, int b) {
// returns which int is smaller
	int smaller = 0;
	if (a < b) {
		smaller = a;
	} else {
		smaller = b;
	}
	return smaller;
	}
}