package com.java.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstQuestion {

	public static void main(String[] args) {
		
		try {
	   // brr();
		
		arr();
		}catch (InputMismatchException e) {
			System.out.println("Error: Input Mismatched");
		}

	}

	public static void arr() {

		Scanner sc = new Scanner(System.in);
		int diagonalSum=0;

	
		System.out.println("Enter the size of 2D array");
		System.out.println("Row: ");
		int n = sc.nextInt();
		System.out.println("Column: ");
		int m = sc.nextInt();

		System.out.println("Enter "+n*m+" elements:");
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				arr[i][j] = sc.nextInt();
			}

		}
		System.out.print("\narr[][] = { ");
		for (int i = 0; i < n; i++) {
			System.out.print("{ ");
			for (int j = 0; j < m; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.print("}");
		}
		System.out.print("}");
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i==j) {
					diagonalSum	= diagonalSum+arr[i][j];
				}
			}
		}
		System.out.println("\n\nDiagonal Sum of array is: "+diagonalSum);
		

	}

	public static void brr() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of 1D array: ");
		int N = sc.nextInt();
		int brr[] = new int[N];

		System.out.print("\n");
		System.out.println("Enter "+N+" Element: ");
		for (int i = 0; i < N; i++) {

			brr[i] = sc.nextInt();
		}

		System.out.print("\nbrr[] = { ");
		for (int i = 0; i < N; i++) {
			System.out.print(brr[i] + " ");
		}
		System.out.println("}");
		
		int max = brr[0];
		for (int i = 1; i < N; i++) {
			
			if(brr[i] > max) {
				max = brr[i];
			    
			}
			
		}
		
		System.out.println("\nMaximum element of an array is: "+max);
		System.out.println();
		
	}

}
