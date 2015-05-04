/**
 * 		Lab 20
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 4/8/2015
 * 		
 * 		Input a list of numbers into an array
 * 		and pass the array to a method that negates
 * 		the values of the array
 *
 */


import java.util.Scanner;

public class Lab20 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[25];	// Array to be filled with values
		int num = 0;			// Each number entered
		int n = 0;				// The size of the array
		
		System.out.println("Enter integers");
		num = input.nextInt();
		
		while (num != -999)
		{
			a[n] = num;
			n++;
			num = input.nextInt();
		}
		
		negateList(a, n);
		
		for (int j = 0; j < n; j++) {
			System.out.println(a[j]);
		}
		
		
	} // End Main
	
	/**
	 * Negates each entry in a given array
	 * 
	 * @param array	The array to be negated
	 * @param currentSize	The size of the array
	 */
	public static void negateList(int[] array, int currentSize)
	{
		for (int i = 0; i < currentSize; i++) {
			array[i] = array[i] * -1;
		}
		
	} // End negateList
	
} // End class
