/**
 * 		Prog 4
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 2/25/2015
 * 		
 * 		Computes the statistics for a collection of test grades.
 *
 */

import java.util.Scanner;

public class Prog4
{

	public static void main(String[] args)
	{
		String continueFlag = "n";	// A flag that the user can enter to enter another list
		Scanner input = new Scanner(System.in);
		
		do
		{
			int grade;					// Holds each user-entered grade
	
			int count = 0;				// Counts up the number of grades
			int lowGrade = 100;			// Calculated lowest grade	
			int highGrade = 0;			// Calculated highest grade	
			int numAs = 0;				// Counters for numbers of each grade
			int numBs = 0;				//
			int numCs = 0;				//
			int numDs = 0;				//
			int numFs = 0;				//
			int sum = 0;				// Calculated sum of the grades
			double sumOfSquares = 0;	// Calculated sum of the squares of the grades
			double standardDev = 0;		// Calculated standard deviation of the grades
			double averageGrade = 0;	// Calculated average of the grades
			
			System.out.println("Please enter grades:");
			grade = input.nextInt();
			while(grade >= 0)
			{
				// Calculate Average Components
				sum += grade;
				count++;
				
				// Calculate Standard Deviation Components
				sumOfSquares += Math.pow(grade, 2);
				
				// Calculate High/Low Grades
				if (grade > highGrade)
				{
					highGrade = grade;
				}
				if (grade < lowGrade)
				{
					lowGrade = grade;
				}
				
				// Categorize grade distribution
				if (grade >= 90)
				{
					numAs++;
				}
				else if (grade >= 80)
				{
					numBs++;
				}
				else if (grade >= 70)
				{
					numCs++;
				}
				else if (grade >= 60) 
				{
					numDs++;
				} 
				else
				{
					numFs++;
				}
				
				grade = input.nextInt();
			}
			
			// Check for zero count			
			if (count != 0) 
			{
				// Calculate Average
				averageGrade = (double) sum / count;
				
				// Calculate Standard Deviation
				standardDev = Math.sqrt((sumOfSquares - (1.0 / count) * Math.pow(sum, 2)) / count);
			}
			else
			{
				averageGrade = 0;
				standardDev = 0;
				lowGrade = 0;
			}
			
			System.out.println("-------------------");
			System.out.println("------RESULTS------");
			System.out.println("-------------------");
			System.out.printf("Average grade:        %4.1f\n", averageGrade);
			System.out.printf("Lowest grade:         %4d\n", lowGrade);
			System.out.printf("Highest grade:        %4d\n", highGrade);
			System.out.printf("Standard deviation:   %4.1f\n", standardDev);
			
			System.out.println("-------------------");
			System.out.println("Grade Distribution:");
			System.out.println("-------------------");
			System.out.printf("A: %2d | B: %2d | C: %2d | D: %2d | F: %2d\n", 
							numAs, numBs, numCs, numDs, numFs);			
			System.out.println("-------------------");
			
			System.out.println("Do you wish to enter another list? (Y/N)");
			continueFlag = input.next();
			
		}
		while (continueFlag.equals("y") || continueFlag.equals("Y"));
		
		input.close();
	}
}
