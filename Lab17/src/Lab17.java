/**
 * 		Lab17
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 3/20/2015
 * 		
 * 		A menu-driven program that tests various methods
 *
 */

import java.util.Scanner;

public class Lab17 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int choice;
		do 
		{
			choice = getChoice();
			switch(choice)
			{
				case 1: 
					System.out.println("Please enter a string");
					String s = input.nextLine();
					System.out.println("Please enter a character");
					char ch = input.next().charAt(0);
					input.nextLine();
					System.out.printf("Result of charCount is %2d\n", charCount(s, ch));
					break;
				case 2: 
					System.out.println("Enter three doubles");
					double d1 = input.nextDouble();
					double d2 = input.nextDouble();
					double d3 = input.nextDouble();
					System.out.printf("Result of average is %2.1f\n", average(d1,d2,d3));
					break;
				case 3: System.out.println("Testing option 3");
					break;
				case 4: System.out.println("Testing option 4");
					break;
				case 5: System.out.println("Exiting program");
					break;
				default: System.out.println("Incorrect choice");
			}
		}
		while (choice != 5);
		
	} // End main
	
	
	/**
	 * Gets the choice from the user and returns the choice
	 * 
	 * @return Returns the user's choice
	 */
	public static int getChoice()
	{
		Scanner in = new Scanner(System.in);
		int choice;
		System.out.println("1. Testing charCount");
		System.out.println("2. Testing average");
		System.out.println("3. Testing future method");
		System.out.println("4. Testing future method");
		System.out.println("5. Quit");
		System.out.print("Please enter a choice: ");
		choice = in.nextInt();
		
		return choice;
	} // End getChoice
	
	/**
	 * Takes in a string and a character and counts the number of occurrences
	 * of that character in a string
	 * 
	 * @param s A string to be tested
	 * @param ch A character to be counted
	 * @return Returns the number of occurrences of the character in the string
	 */
	public static int charCount(String s, char ch)
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == ch)
					count++;
		}
		return count;
	} // End charCount
	
	/**
	 * Calculates the average of three double;
	 * @param d1 Double 1
	 * @param d2 Double 2
	 * @param d3 Double 3
	 * @return Returns average of three doubles
	 */
	public static double average(double d1, double d2, double d3)
	{
		return (d1+d2+d3)/3;
	} // End average
	
} // End class
