/**
 * 		Lab 9
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 2/13/2015
 * 		
 * 		Determines the season for a given month and day
 *
 */
import java.util.Scanner;

public class Lab9 
{

	public static void main(String[] args) 
	{
		
		int month;
		int day;
		
		String season;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the month and day: ");
		month = input.nextInt();
		day = input.nextInt();
		
		if (month == 1 || month == 2 || month == 3) 
		{
			season = "Winter";
		} 
		else if (month == 4 || month == 5 || month == 6) 
		{
			season = "Spring";
		} 
		else if (month == 7 || month == 8 || month == 9) 
		{
			season = "Summer";
		} 
		else
		{
			season = "Fall";
		}
		
		if (month % 3 == 0 && day >= 21)
		{
			if (season.equals("Winter"))
			{
				season = "Spring";
			} 
			else if (season.equals("Spring"))
			{
				season = "Summer";
			} 
			else if (season.equals("Summer"))
			{
				season = "Fall";
			} 
			else 
			{
				season = "Winter";
			}
		}
			
		// Results
		
		System.out.print("The season is " + season);
		
		input.close();
	}
}
