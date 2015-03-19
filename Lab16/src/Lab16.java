/**
 * 		Lab16
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 3/18/2015
 * 		
 * 		Tests a method that returns a count of chars
 *
 */

import java.util.Scanner;

public class Lab16 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Part 1 Count = "+charCount("AABBBCCC", 'B'));
		
		System.out.println("Please enter a string:");
		String s = input.nextLine();
		
		System.out.println("Please enter a character:");
		char ch = input.next().charAt(0);
			
		System.out.println("Part 2 Count = "+charCount(s, ch));
		
		input.close();
	} // End main
	
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
	
}
