// -------------------------------------------------------
// Assignment 2
// Written by:Ashwin Philip Student ID: 40096505
// For COMP 248 Section (2182-P) – Fall 2018
// Date: October 12th, 2018
// --------------------------------------------------------
import java.util.Scanner;
public class Integer_division {

	public static void main(String[] args) {                //The purpose of this program is to take a number inputed by the user
															//and print the sum of the digits and also print all the divisors of the sum
															//The user can then decide to try again using another number.
		// TODO Auto-generated method stub
		System.out.println("******************** \n" 
						 + "Welcome to our Calculation Program! \n" 
						 + "********************" );
		int userInput = 0;									//Declaring and initializing all the variables.
		int finalNum = 0;												
		int sum = 0;
		int counter = 1;
		String repeat;										//We need a string in order to be able to ask the user if they want to use another number
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a number with at most 7-digits: "); //Prompting the user to input a number
		userInput = keyboard.nextInt();
		
		finalNum = userInput;	//Since the value of userInput will change later in the code, we use finalNum to 
		while (userInput > 0)   
		{
			sum = sum + userInput % 10; //In the loop: Every time we mod by 10, the last digit of userInput will be added to sum
			userInput = userInput / 10; //After all the digits have been accounted for, the value of userInput will become less than 0, which will terminate the loop.
		}
		
		System.out.println("\nSum of digits of " + finalNum + " is: " + sum); //Outputting the sum of all the digits of userInput
		System.out.println("\nThe divisors of " + sum + " are as follows: \n");//Output this message now, calculations will follow...
		
		
			while (counter <= sum)
			{
			
			if (sum%counter == 0)   //Since a divisor is a number that can be divided without having any remainder, the modulus should be 0.
			{
				System.out.print( counter + "  " );
			}
			
			counter = counter + 1;  //Once the value counter is greater than the value of sum, the loop will terminate.
			}
			
			System.out.print("\n\nWould you like to use another number? (yes to repeat, no to stop): "); 
			repeat = keyboard.next(); //user inputs yes or no depending on whether they want to use another number.
			
			
			//The next few lines will only be compiled if the user inputs "yes".
			//The calculations are done the same was as the first time. 
			
			
			while (repeat.equalsIgnoreCase("yes")) // Using IgnoreCase in case the user uses a capital "Y".
			{
				System.out.print("\nPlease enter a number with at most 7-digits: "); 
				userInput = keyboard.nextInt();
				
				finalNum = userInput;
				sum = 0; //Since sum has a value, it needs to be reset to 0.
				
				while (userInput > 0)
				{
					sum = sum + userInput % 10;
					userInput = userInput / 10;
				}
				
				System.out.println("\nSum of digits of " + finalNum + " is: " + sum);
				System.out.println("\nThe divisors of " + sum + " are as follows: \n");
				
				counter = 1;
				
					while (counter <= sum)
					{
					
					if (sum%counter == 0)
					{
						System.out.print( counter + "  " );
					}
					
					counter = counter + 1;
					}
					
					System.out.print("\n\nWould you like to use abother number? (yes to repeat, no to stop): ");
					repeat = keyboard.next();
			}
			
			System.out.println("\n\nThank you for using this Calculation program!"); //Closing message for the user
			
			keyboard.close(); //Closing the keyboard.
		}
			
		
		
		
	}


