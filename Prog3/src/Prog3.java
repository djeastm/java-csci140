/**
 * 		Program 3
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 2/18/2015
 * 		
 * 		Counts number of integers of various lengths and computes
 * 		their averages, separately and in total.
 *
 */
import java.util.Scanner;

public class Prog3 
{

	public static void main(String[] args) 
	{
		
		int nextInteger;				// User-entered integer values
		
		int oneDigitInts = 0;			// Calculated count of 1-digit integers
		int twoDigitInts = 0;			// Calculated count of 2-digit integers
		int threePlusDigitInts = 0;		// Calculated count of 3- or more-digit integers
		
		int oneDigitSum = 0;			// Calculated sum of 1-digit integers
		int twoDigitSum = 0;			// Calculated sum of 2-digit integers
		int threePlusDigitSum = 0;		// Calculated sum of 3- or more-digit integers
		
		double oneDigitAverage;			// Calculated average of 1-digit integers
		double twoDigitAverage;			// Calculated average of 2-digit integers
		double threePlusDigitAverage;	// Calculated average of 3- or more-digit integers
		
		double totalAverage;			// Calculated average of all integers
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a list of integers. Enter a negative number to quit.");
		nextInteger = input.nextInt();
		
		while (nextInteger >= 0) 
		{
			if (nextInteger >= 100) 
			{
				threePlusDigitInts++;
				threePlusDigitSum += nextInteger;
			} 
			else if (nextInteger >= 10)
			{
				twoDigitInts++;
				twoDigitSum += nextInteger;
			} 
			else 
			{
				oneDigitInts++;
				oneDigitSum += nextInteger;
			}
			nextInteger = input.nextInt();
		}
		
		// Ensure we aren't trying to divide by zero
		if (oneDigitInts != 0)
		{
			oneDigitAverage = (double) oneDigitSum / oneDigitInts;
		} 
		else 
		{
			oneDigitAverage = 0;
		}
		
		if (twoDigitInts != 0) 
		{
			twoDigitAverage = (double) twoDigitSum / twoDigitInts;
		} 
		else 
		{
			twoDigitAverage = 0; 
		}
		
		if (threePlusDigitInts != 0) 
		{
			threePlusDigitAverage = (double) threePlusDigitSum / threePlusDigitInts;
		}
		else
		{
			threePlusDigitAverage = 0;
		}
		
		totalAverage = (double) (oneDigitSum + twoDigitSum + threePlusDigitSum) / 
						(oneDigitInts + twoDigitInts + threePlusDigitInts);
		
		// Results
		
		System.out.println("Number of one digit integers = " + oneDigitInts);
		System.out.printf("Average of one digit integers = %.1f\n\n", oneDigitAverage);

		System.out.println("Number of two digit integers = " + twoDigitInts);
		System.out.printf("Average of two digit integers = %.1f\n\n", twoDigitAverage);
		
		System.out.println("Number of integers with 3 or more digits = " + threePlusDigitInts);
		System.out.printf("Average of integers with 3 or more digits = %.1f\n\n", threePlusDigitAverage);
		
		System.out.printf("Average of all integers = %.1f\n\n", totalAverage);
				
		input.close();
	}
}
