/**
 * 		Prog6
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 3/23/2015
 * 		
 * 		Creates arithmetic tests containing random integers
 *
 */

import java.util.Scanner;

public class Prog6 
{

	public static void main(String[] args) 
	{
		
		final int NUM = 5; 				// Number of questions on each test
		String name;					// The user's name
		int skillLevel;					// The user's chosen skill level
		char choice;					// User's choice from the menu
		int numTests = 0;				// The total number of tests taken
		int correctAnswers = 0; 		// The total number of correct answers
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your full name: ");
		name = input.nextLine();
		do 
		{
			System.out.print("Enter your desired skill level (1-3): ");
			skillLevel = input.nextInt();	
		}
		while (skillLevel < 1 || skillLevel > 3);
		
		do 
		{
			choice = getChoice();
			if (choice == 'A' || choice == 'a') 
			{
				correctAnswers += addition(skillLevel, NUM);
				numTests++;
			}
			else if (choice == 'S' || choice == 's') 
			{
				correctAnswers += subtraction(skillLevel, NUM);
				numTests++;
			}
			else if (choice == 'M' || choice == 'm') 
			{
				correctAnswers += multiplication(skillLevel, NUM);
				numTests++;
			}
			else if (choice == 'Q' || choice == 'q') 
				printResults(name, numTests, correctAnswers, NUM);
			else System.out.println("Incorrect choice");
			
		}
		while (choice != 'Q' && choice != 'q');
		
	} // End main
	
	
	/**
	 * Gets the choice from the user and returns the choice
	 * 
	 * @return Returns the user's choice
	 */
	public static char getChoice()
	{
		Scanner in = new Scanner(System.in);
		char choice;
		System.out.println("");
		System.out.println("Choose your test:");
		System.out.println("(A)ddition");
		System.out.println("(S)ubtraction");
		System.out.println("(M)ultiplication");
		System.out.println("(Q)uit");
		System.out.print("Your choice: ");
		choice = in.next().charAt(0);
		in.nextLine();
		
		return choice;
	} // End getChoice
	
	/**
	 * Helper function to get a maximum value
	 * @param skillLevel
	 * @return Returns appropriate value for skill level
	 */
	public static int getMax(int skillLevel)
	{
		switch (skillLevel)
		{
			case 1: return 9;
			case 2: return 99;
			case 3: return 10;
			default: return -1;
		}
	} // End getMax
	
	/**
	 * Helper function to get a minimum value
	 * @param skillLevel
	 * @return Returns appropriate value for skill level
	 */
	public static int getMin(int skillLevel)
	{
		switch (skillLevel)
		{
			case 1: return 1;
			case 2: return 10;
			case 3: return -10;
			default: return -1;
		}
	} // End getMin
	
	/**
	 * Sets up and executes addition tests
	 * 
	 * @param skillLevel The skill level of the player
	 * @param numQuestions The number of questions to ask
	 * @return Returns number of correct answers on the test
	 */
	public static int addition(int skillLevel, int numQuestions) 
	{
		return performOperation("Addition", skillLevel, numQuestions);
	} // End addition
	
	/**
	 * Sets up and executes subtraction tests
	 * 
	 * @param skillLevel The skill level of the player
	 * @param numQuestions The number of questions to ask
	 * @return Returns number of correct answers on the test
	 */
	public static int subtraction (int skillLevel, int numQuestions) 
	{
		return performOperation("Subtraction", skillLevel, numQuestions);
	} // End subtraction
	
	/**
	 * Sets up and executes multiplication tests
	 * 
	 * @param skillLevel The skill level of the player
	 * @param numQuestions The number of questions to ask
	 * @return Returns number of correct answers on the test
	 */
	public static int multiplication (int skillLevel, int numQuestions) 
	{
		return performOperation("Multiplication", skillLevel, numQuestions);
	} // End multiplication
	
	/**
	 * Takes in minimum and maximum value and 
	 * generates a random number within that range
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	public static int randomGenerator(int min, int max)
	{
		return (int) (Math.random() * (max - min + 1)) + min;
	}
	
	/**
	 * Takes in an operation, a skill level, and the number of questions and
	 * shows the user the appropriate number of test questions on that operation
	 * and returns the number of questions the user answered correctly
	 * 
	 * @param operation A string instructing method which operation to perform
	 * @param skillLevel The skill level of the player
	 * @param numQuestions The number of questions to ask
	 * @return Returns the number of correct answers to the questions asked
	 */
	public static int performOperation(String operation, int skillLevel, int numQuestions)
	{
	
		int min = getMin(skillLevel); 		// Minimum operand to be used
		int max = getMax(skillLevel);		// Maximum operand to be used
		int correctAnswers = 0;
				
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.println("------------------");
		System.out.println(operation+" Test");
		System.out.println("------------------");
		System.out.println();
		
		
		for (int i = 0; i < numQuestions; i++)
		{
			int first = randomGenerator(min, max);
			int second = randomGenerator(min, max);
			
			int correctAnswer = 0;
			char operator;
			switch (operation)
			{
				case "Addition": 
				{
					correctAnswer = first + second;
					operator = '+';
					break;
				}
				case "Subtraction": 
				{
					correctAnswer = first - second;
					operator = '-';
					break;
				}
				case "Multiplication": 
				{
					correctAnswer = first * second;
					operator = '*';
					break;
				} 
				default:
				{
					correctAnswer = 0;
					operator = ' ';
				}
			}

			int userAnswer;
			
			System.out.printf("               %4d\n", first);
			System.out.printf("             "+operator+" %4d\n", second);
			System.out.println("             ------");
			System.out.println("Enter answer:  ");
			userAnswer = input.nextInt();
			
			if (userAnswer == correctAnswer)
			{
				System.out.println("Correct!");
				System.out.println();
				correctAnswers++;
			}
			else 
			{
				System.out.println("Incorrect. The right answer is "+correctAnswer);
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("Test is complete.");
		System.out.println("Number of correct answers = "+ correctAnswers);
		System.out.println();
				
		return correctAnswers;
	}
	
	/**
	 * Prints the results of the tests
	 * 
	 * @param userName The user's name
	 * @param numTests The number of tests taken
	 * @param correctAnswers The number of correctAnswers
	 * @param numQuestions The number of questions on each test
	 */
	public static void printResults (String userName, int numTests, int correctAnswers, int numQuestions) 
	{
		double correctPercent;
		int totalQuestions = numTests * numQuestions;
		
		if (totalQuestions != 0)
		{
			correctPercent = (double) correctAnswers/totalQuestions * 100;
		}
		else correctPercent = 0;
		
		System.out.println();
		System.out.printf("Summary Results for %s\n", userName);
		System.out.println();
		System.out.printf("Total number of questions: %d\n", numTests * numQuestions);
		System.out.printf("Percentage of correct answers: %.1f\n", correctPercent);
		System.out.println();
		
	} // End printResults
	
	
} // End class
