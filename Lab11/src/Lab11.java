/**
 * 		Lab 11
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 2/20/2015
 * 		
 * 		Takes in a string from the user, then prints out various substrings
 * 		of that source string.
 *
 */
import java.util.Scanner;

public class Lab11 
{

	public static void main(String[] args) 
	{
		
		String string;			// A user-entered source string
		
		int numLowerCase = 0;	// An integer that counts the number of lowercase letters
		int numVowels = 0;		// An integer that counts the number of vowels
			
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		string = input.nextLine();
		
		for (int i = 0; i < string.length(); i++) 
		{
			char ch = string.charAt(i);
			if (Character.isLowerCase(ch)) 
			{
				numLowerCase++;
			}
			if (ch == 'a' || ch == 'A' ||
				ch == 'e' || ch == 'E' ||
				ch == 'i' || ch == 'I' ||
				ch == 'o' || ch == 'O' ||
				ch == 'u' || ch == 'U' ||
				ch == 'y' || ch == 'Y') 
			{
				numVowels++;
			}
			
		}
				
		System.out.println("Original line: " + string);
		System.out.println("Number of lowercase letters: " + numLowerCase);
		System.out.println("Number of vowels: " + numVowels);
		System.out.print("Line in reverse: ");
		for (int i = string.length()-1; i >= 0; i--) 
		{
			System.out.print(string.charAt(i));
		}
		System.out.println("");
		System.out.print("Every other character: ");
		for (int i = 0; i < string.length(); i = i + 2) 
		{
			System.out.print(string.charAt(i));
		}
		System.out.println();
		System.out.println("Upper Case: " + string.toUpperCase());
		
		input.close();
	}
}
