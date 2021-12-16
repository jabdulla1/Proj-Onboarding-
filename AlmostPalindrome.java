package com.revature;

import java.util.Scanner;

public class AlmostPalindrome {

	
	public static boolean almostPalindrome(String string) {
		int count = 0;
		for (int i = 0; i < string.length()/2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - (i+1))) {
				count++;
			}
		}
		if (count <= 1) {
			 
			 return true;
		} else {
			
			return false;
		}

	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean running = true;
		boolean isAlmostPalindrome= false;
		
		
		Scanner sc = new Scanner(System.in);
		while (running) {
			System.out.println("Enter a string: ");
			String input = sc.nextLine();
			isAlmostPalindrome = almostPalindrome(input);
			
			System.out.println("Is it almost a palindrome: "+isAlmostPalindrome);
			
			
				System.out.println("Do you want to continue? ");
				System.out.println("Press 'n' to quit ");
				String answer = sc.nextLine();
				
				if(answer.equals("n")) {
					System.out.println("Thanks");
					running = false;
				}				
			
		}
		
		sc.close();

		
		
	}

}
