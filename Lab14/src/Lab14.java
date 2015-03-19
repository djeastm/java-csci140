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
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		lines = input.nextInt();
		
		for (int i = 0; i < lines; i++)
		{
			for (int j = 0; j < lines; j++)
			{
				System.out.print ("x");
			}
			System.out.print (" ");
			if (i == 0 || i == lines-1) 
			{
				for (int k = 0; k < lines; k++)
				{
					System.out.print ("x");
				}
			}
			else 
			{
				System.out.print ("x");
				for (int k = 0; k < lines-2; k++)
				{
					System.out.print (" ");
				}
				System.out.print ("x");
			}	
			System.out.println();
		}
		input.close();
	}
}
