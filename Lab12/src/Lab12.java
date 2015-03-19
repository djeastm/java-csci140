/**
 * 		Lab 12
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 2/23/2015
 * 		
 * 		This program reads a file with numbers, and writes the numbers to another
 * 		file, lined up in a column and followed by their total.
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab12 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		double value;
		double total = 0;
		
		File inputFile = new File("Lab12in.txt");
		Scanner input = new Scanner(inputFile);
		PrintWriter output = new PrintWriter("Lab12out.txt");
		
		while(input.hasNext())
		{
				value = input.nextDouble();
				output.printf("%15.2f\n", value);
				total += value;
		}
		
		output.printf("Total = %8.2f\n", total);
		
		input.close();
		output.close();
	}
}
