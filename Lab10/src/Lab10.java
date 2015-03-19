/**
 * 		Lab 10
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 2/16/2015
 * 		
 * 		Tells the user if an integer is even or odd. Program repeats as long as user
 * 		doesn't enter a negative value.
 *
 */
import java.util.Scanner;

public class Lab10 
{

	public static void main(String[] args) 
	{
		
		int number;				// An integer that the user enters
		int evenCount = 0;		// An integer that counts the number of even values entered
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a list of integers terminated by any negative number: ");
		number = input.nextInt();
		
		while ( number >= 0 ) 
		{
			if (number % 2 == 0) 
			{
				System.out.println(number + " is even");
				evenCount++;
				
			} else 
			{
				System.out.println(number + " is odd");
			}
			number = input.nextInt();
		}
		
		System.out.print("The number of even values entered is: " + evenCount);
		
		input.close();
	}
}
