// -------------------------------------------------------
// Assignment 2
// Written by:Ashwin Philip Student ID: 40096505
// For COMP 248 Section (2182-P) – Fall 2018
// Date: October 12th, 2018
// --------------------------------------------------------
import java.util.Scanner;
public class English_results {

	public static void main(String[] args) {	//The purpose of this program is to help international students
												//with their language assessment. The program allows them to read about
												//the requirements and scoring of the assessment.
		// TODO Auto-generated method stub
		
		double listening;		//Declaring all the variables 
		double reading;
		double writing;
		double speaking;
		double score;
		double decimal;
		int userInput;
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("********************" + "\n"    //Welcome message for the user.
							+ "Welcome to the Concordia Language Proficiency Evaluator!" 
							+ "\n\n" + "********************" + "\n\n");
		
		System.out.println(" Please select an option: ");	//Prompting the user to select which option they want.
		System.out.println(" 1-  Language Proficiency Requirements for the Appllicant" + "\n" +
						   " 2- Evaluation of your Language Proficiency" + "\n");
		System.out.print("Please enter the digit that corresponds to your choice: ");
		
		userInput = keyboard.nextInt();		//User inputs 1 or 2 depending on which option they want.
		System.out.println("");
		if (userInput == 1)		//This will only compile if the user inputs "1", this will print the requirements of the assessment.
		{
			System.out.println(" The overall score of the applicant in the IELTS exam needs to be equal to or above 6.5"
					+ " and the scores for reading and writing should not be below 6.0." + "\n"
					+ " If your overall score is 6, and your reading and writing scores are at least 6,"
					+ " you will be eligible for conditional admission." + "\n" + "So you need to take an English course in the first semester."
					+ " Otherwise you have to retake the IELTS exam. Thank you for choosing Concordia." + "\n\n");
		}
		if (userInput == 2) //The following will only compile if the user inputs "2", this will cause the main part of the program to compile
		{
			System.out.print("Please enter your listening score: "); //The user is asked to input their score in each category.
			listening = keyboard.nextDouble();
			System.out.println("\n");
			
			System.out.print("Please enter your speeaking score: ");
			speaking = keyboard.nextDouble();
			System.out.println("\n");
			
			System.out.print("Please enter your reading score: ");
			reading = keyboard.nextDouble();
			System.out.println("\n");
			
			System.out.print("Please enter your writing score: ");
			writing = keyboard.nextDouble();
			System.out.println("\n");
			
		
			
			score = (listening + speaking + reading + writing)/4; //THe average is calculated.
			decimal = (int)score;
			
			//The following lines of code show how I rounded the value of the average.
			//Each if loop accounts for a possibility of rounding.
			
			if (score-decimal < 0.25) //This if statement will cause any value of score that has a decimal less than .25 to be rounded down to 6
			{
				score = decimal;
			}
			
			if (0.25 <= score-decimal && score-decimal < 0.75) //This if statement will cause any value of score that has a decimal between .25 and .75 to be rounded to .5. 
			{
				score = decimal + 0.5;
			}
			
			if (0.75 <= score-decimal && score-decimal < 1)		//This if statement will cause any value of score that has a decimal greater than .75 to be rounded up to 1.
			{
				score = decimal +1;
			}
			System.out.println("Your overall score is: " + score);		//Outputting the users results
			System.out.println("Your reading score is: " + reading);
			System.out.println("Your writing score is:" + writing + "\n");
			
			//The following if statements take into consideration the requirements to pass the assessment (specified in the instructions).
			if (score >= 6.5 && reading >= 6 && writing >= 6)
			{
				System.out.println("CONGRATULATIONS! You are eligible for admission!");
			}
			
			if (score >= 6.5 &&(reading < 6 || writing < 6))
			{
				System.out.println("You are eligible for conditional admission!");
			}
			
			if (score == 6 && reading >= 6 && writing >= 6)
			{
				System.out.println("You are eligible for conditional admission!");
				
			}
			if (score == 6 && (reading < 6 || writing < 6))
			{
				System.out.println("Sorry, you must retake the exam.");
			}
			
			if (score < 6)
			{
				System.out.println("Sorry, you must retake the exam.");
			}
			
			
			keyboard.close(); 		//Closing the keyboard.
			
			
				
				
				
				
				
				
				
				
				
				
				
			
		
		}	
	}

}
