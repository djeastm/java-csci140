/**
 * 		Lab 21
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 4/14/2015
 * 		
 * 		Takes in a data file with and puts numbers
 * 		into a two-dimensional array
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab21 
{

	public static void main(String[] args) 
	{
		File inputFile = new File("lab21.txt");
		Scanner input = new Scanner(System.in);
		try {
			input = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int[][] array = new int[25][50];				// Array to put numbers into
		int rows = input.nextInt();						// Number of rows
		int cols = input.nextInt();						// Number of columns
		input.nextLine();
		
		while (input.hasNext())
		{
			for (int i = 0; i < rows; i++)
			{
				for (int j = 0; j < cols; j++)
				{
					array[i][j] = input.nextInt();
				}
			}
			
		}
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				System.out.printf("%6d", array[i][j]);
				
			}
			System.out.println();
		}
		
	} // End main
	
	
	
} // End class
