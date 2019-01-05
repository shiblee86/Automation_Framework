package com.usa.ttech.practicecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeWithScannerClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number till which the prime numbers are to be calculated: ");
        int input = scanner.nextInt();
        
        List<Integer> primes = new ArrayList<>();

        // loop through the numbers one by one
      for (int i = 2; i < input; i++) {
            boolean isPrimeNumber = true;

            // check to see if the number is prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break; // exit the inner for loop
                }
            }

            // print the number if prime
            if (isPrimeNumber) {
                primes.add(i);
            }
       }
        System.out.println("Prime number size : " + primes.size());
       
        primes.forEach(prime -> 
        System.out.println("Prime no is::"+prime));
        scanner.close();
    }

	}


