package com.revature;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyUnhappayNumbers {
	
	 public static boolean isHappyNumber(int number) {
	        Set<Integer> seenNumbers = new HashSet<Integer>();
	        while(seenNumbers.add(number)){
	            int digitsSum = 0;
	            while(number > 0) {
	                digitsSum += Math.pow(number % 10 , 2);
	                number /= 10;
	            }
	            number = digitsSum;
	            if(number == 1)
	                return true;
	        }
	        return false;
	    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean running = true;
		boolean isHappyOrUnhappy= false;
		Scanner sc = new Scanner(System.in);
		
		while (running) {
			System.out.println("Enter a number:");
			String input = sc.nextLine();
			isHappyOrUnhappy= isHappyNumber(Integer.parseInt(input));
			
			if(isHappyOrUnhappy) {
				System.out.println(input +" is happy");
			}else {

				System.out.println(input +" is unhappy");
			}		
				
				System.out.println("Do you want to continue? ");
				System.out.println("Press 'n' to quit");
				String answer = sc.nextLine();
				
				if(answer.equals("n")) {
					System.out.println("Thanks");
					running = false;
				}				
			
		}
		
		sc.close();

		
		
	}

}
