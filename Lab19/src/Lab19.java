/**
 * 		Lab19
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 3/30/2015
 * 		
 * 		Stores values in an array and print them
 *
 */

public class Lab19 
{

	public static void main(String[] args) 
	{
		int[] alpha = new int[50];
		
		for (int i = 0; i < 25; i++) 
		{
			alpha[i] = i * 2;
		}
		
		for (int i = 25; i < 50; i++) 
		{
			alpha[i] = -1;
		}
		
		for (int i = 0; i < 50; i++) 
		{
			System.out.println(alpha[i]);
		}
		
		
	} // End Main
	
} // End class
