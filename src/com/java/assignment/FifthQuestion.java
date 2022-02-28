package com.java.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FifthQuestion {

	public static void main(String[] args) {
    
		factorial();
		
	}

	public static void factorial() {

		Scanner sc = new Scanner(System.in);

		try {
		System.out.println("Enter the Number: ");
		int x = sc.nextInt();

		int n = 0;

		for (int i = x - 1; i > 0; i--) {
			x = x * i;
		}
		System.out.println("Factorial of number is: " + x);
		}
		catch (InputMismatchException e) {
			System.out.println("Error: Input Mismatched");
		}

		
	}

}
