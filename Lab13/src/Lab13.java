/**
 * 		Lab 14
 * 		CSCI 140L
 * 		
 * 		@author David Eastman & Markus Stroman
 * 		Last Revised: 2/25/2015
 * 		
 * 		Reads an integer and displays, using asterisks, a filled and hollow square
 *
 */

import java.util.Scanner;

public class Lab14
{

	public static void main(String[] args)
	{
		
		int	lines = 0;				// A user-entered integer that represents the number of row
		int i = 0;
		int j = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		lines = input.nextInt();
		
		for (i = 0; i < lines; i++)
		{
			for (j = 0; j < 5; j++)
			{
				System.out.println ("x");
			}
			
		}
	
		
		input.close();
		
	}
}
