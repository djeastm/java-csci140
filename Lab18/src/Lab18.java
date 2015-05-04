/**
 * 		Lab18
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 3/25/2015
 * 		
 * 		A menu-driven program that tests various methods
 *
 */

import java.util.Scanner;

public class Lab18 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int choice;
		do 
		{
			choice = getChoice();
			String s = "";
			switch(choice)
			{
				case 1: 
					System.out.println("Please enter a string");
					s = input.nextLine();
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
				case 3: 
					System.out.println("Please enter a string");
					s = input.nextLine();
					System.out.printf("Result of middle is %s\n", middle(s));
					break;
				case 4: 
					System.out.println("Please enter a string");
					s = input.nextLine();
					System.out.println("Please enter an integer");
					int n = input.nextInt();
					input.nextLine();
					System.out.printf("Result of repeat is %s\n", repeat(s, n));
					break;
				case 5: System.out.println("Exiting program");
					break;
				default: System.out.println("Incorrect choice");
			}
			System.out.println();
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
		System.out.println("3. Testing middle");
		System.out.println("4. Testing repeat");
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
	

	/**
	 * Takes in a string and takes different substrings
	 * depending on whether the string length is even/odd
	 * 
	 * @param s A string to be tested
	 * @return Returns a substring of the original string
	 */
	public static String middle(String str)
	{
		String s = "";
		if (str.length() % 2 == 1)
		{
			int middle = str.length() / 2;
			s = "" + str.charAt(middle);
		}
		else if (str.length() % 2 == 0)
		{
			int middle = str.length() / 2;
			s = str.substring(middle-1, middle+1); 
		}
		
		return s;
	} // End middle
	
	/**
	 * Takes in a string and an integer and repeats the string 
	 * the number of times indicated by the integer
	 * 
	 * @param s A string to be tested
	 * @param n An integer that is the number of times to repeat
	 * @return Returns a multiple of the original string
	 */
	public static String repeat(String str, int n)
	{
		String s = "";
		for (int i = 0; i < n; i++) 
		{
			s += str;
		}
		
		return s;
	} // End repeat
	
} // End class
