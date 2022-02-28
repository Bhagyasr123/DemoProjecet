package com.java.assignment;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondQuestion {

	public static void main(String[] args) {

		int count = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the size of array: ");
			int N = sc.nextInt();
			String Key[] = new String[N];
			int arr[] = new int[N];

			System.out.println("Enter the " + N + " Key elements: ");
			for (int i = 0; i < N; i++) {
				Key[i] = sc.next();
			}
			System.out.println("Enter the " + N + " Arr elements: ");
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.print("\nKeys = {");
			for (String a : Key) {
				System.out.print(a + " ");
			}
			System.out.print("}\n");

			System.out.print("arr = {");
			for (int a : arr) {
				System.out.print(a + " ");
			}
			System.out.print("}\n");

			System.out.print("Enter the Key: ");
			String s = sc.next();

			HashMap<String, Integer> data = new HashMap();
			for (int i = 0; i < N; i++) {
				data.put(Key[i], arr[i]);

			}
			System.out.println("\nMap value: " + data);

			for (String State : data.keySet()) {
				if (State.contains(s)) {

					System.out.println("\nMap value: " + data.get(State));
					count++;

				}

			}
			if (count == 0)

			{
				System.out.println("No matched Key in the map");

			}
		} catch (InputMismatchException e) {
			System.out.println("Error: Input Mismatched");
		}
	}

}
