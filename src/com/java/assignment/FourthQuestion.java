package com.java.assignment;

import java.util.Scanner;

public class FourthQuestion {

	public static void main(String[] args) {

		palindrome();
		
	}
	
	public static void palindrome() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String s = sc.next();
		
		String str = s;
		
		char std;
		String temp = null+" ";
		int i=s.length()-1;
		
		do{
			
			std = s.charAt(i);
			temp = temp+std;
			
			i--;
		}while(i >= 0);
		
		s = temp.split("\\ ")[1];
		
		
		if(str.equals(s)) {
			System.out.println("\nString is palindrome.");
		}
		else
		{
			System.out.println("\nString is not palindrome.");
		}
		
		
	}
	

}
