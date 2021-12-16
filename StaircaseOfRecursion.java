package com.revature;

import java.util.Scanner;

public class StaircaseOfRecursion {

	public static int waysToClimb(int a) {
		
		if(a <= 1) { 
			return 1;
		}
		
		return waysToClimb(a-1) + waysToClimb(a-2);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean running = true;
		int count= 0;
		Scanner sc = new Scanner(System.in);
		
		while (running) {
			System.out.println("Enter then number of stairs:");
			String input = sc.nextLine();
			count= waysToClimb(Integer.parseInt(input));
			
			System.out.println("The number of ways a person can climb "+input+ " stairs are: "+count);
				
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
