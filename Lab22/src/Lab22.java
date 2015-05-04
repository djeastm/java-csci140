/**
 * 		Lab 22
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 4/17/2015
 * 		
 * 		Takes in a data file with and prints
 * 		a star map
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab22 
{

	public static void main(String[] args) 
	{
		File inputFile = new File("lab22.txt");
		Scanner input = new Scanner(System.in);
		try {
			input = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int[][] array = new int[50][80];				// Array to put numbers into
		int rows = input.nextInt();						// Number of rows
		int cols = input.nextInt();						// Number of columns
		
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
		System.out.print("--");
		for (int i = 0; i < cols-1; i++)
		{
			System.out.print("----");
		}
		
		System.out.println();
		for (int i = 1; i < rows-1; i++)
		{
			System.out.print(":");
			for (int j = 1; j < cols-1; j++)
			{
				int sum = 
						array[i-1][j-1]+
						array[i][j-1]+
						array[i+1][j-1]+
						array[i-1][j]+
						array[i][j]+
						array[i+1][j]+
						array[i-1][j+1]+
						array[i][j+1]+
						array[i+1][j+1]
					;
				
				if ((sum / 9.0) >= 6.0 )
				{
					System.out.print("   *");
				}
				else
				{
					System.out.print("    ");
				}
				
			}
			System.out.print("    :");
			System.out.println();
		}
		
		for (int i = 0; i < cols-1; i++)
		{
			System.out.print("----");
		}
		System.out.print("--");
		
	} // End main
	
} // End class
