package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
	      System.out.print("Enter a number to find its prime factors: ");
	         int number = input.nextInt();

	      System.out.print("Prime factors of " + number + " are: ");

	  /* It starts by iterating through all possible prime factors from 2 up to the square root of the given number.
	  * If the current number is divisible by the current prime factor, 
	  * it prints the prime factor and updates the number to be the result of dividing it by the prime factor.
	  */
	      for(int i=2; i*i<=number ; i++) {
	            while(number % i == 0) {
	                System.out.print(i + " ");
	                number /= i;
	            }
	        }

	        if(number > 1) {
	            System.out.print(number);
	        }
	}



	}


