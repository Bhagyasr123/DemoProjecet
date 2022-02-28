package com.java.assignment;

import java.util.Scanner;

public class ThirdQuestion {

	public static void main(String[] args) {
		swap();

	}

	public static void swap() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Before Swapping\n");

		System.out.print("First String: ");
		String a = sc.next();
		System.out.print("Second String: ");
		String b = sc.next();

		a = a + "." + b;

		b = a.split("\\.")[0];
		a = a.split("\\.")[1];

		System.out.println("\nAfter Swapping\n");

		System.out.println("Enter first String: " + a);
		System.out.println("Enter second String: " + b);

	}

}
