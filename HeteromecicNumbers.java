package com.revature;

import java.util.Scanner;

public class HeteromecicNumbers {

	public static boolean isHeteromecicNumber(int number) {
		
		for(int i=0; i<number; i++)
        {
			
			if(number == 0) {
            	return true;
            }
			
            if(i*(i+1) == number)
            {
                return true;
          
            }
            
        }
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean running = true;
		boolean isHetermecic= false;
		Scanner sc = new Scanner(System.in);
		
		while (running) {
			System.out.println("Enter a pronic number:");
			String input = sc.nextLine();
			isHetermecic=isHeteromecicNumber(Integer.parseInt(input));

			if(isHetermecic) {
				System.out.println(input +" is a Hetermecic number");
			}else {

				System.out.println(input +" is not a Hetermecic number");
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
