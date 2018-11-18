package com.usa.ttech.practicecode;

public class FindFactorialNumber {

	public static void main(String[] args) {
		int counter = 5;
		int factorial = 1;
		
		/*4!=4×3×2×1
				...
				n! = n×(n−1)×(n−2)...×2×1*/
		
		
		do {
		    factorial *= counter--; /* Multiply, then decrement. */
		} while (counter > 0);
		System.out.println("The factorial of 5 is " + factorial);
		
		

	}

}
