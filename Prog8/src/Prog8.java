/**
 * 		Prog8
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 4/20/2015
 * 		
 * 		Takes in a data file with voting results
 * 		sort them, and print a summary
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prog8 
{

	public static void main(String[] args) 
	{
		File inputFile = new File("prog8.txt");
		Scanner input = new Scanner(System.in);
		try {
			input = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int[][] votes = new int[20][10];				// Array to put numbers into
		int rows = input.nextInt();						// Number of rows
		int cols = input.nextInt();						// Number of columns
		String[] names = new String[10];				// Array to put candidate names into
		int[] totals = new int[10];						// Array to put candidate totals into
		
		for (int i = 0; i < cols; i++)
		{
			names[i] = input.next();
		}
		
		while (input.hasNext())
		{
			for (int i = 0; i < rows; i++)
			{
				for (int j = 0; j < cols; j++)
				{
					votes[i][j] = input.nextInt();
				}
			}
		}
		
		computeTotals(votes, totals, rows, cols);
		printByPrecinct(votes, names, totals, rows, cols);
		printResults(totals, names, cols);
		
		
	} // End main
	
	/**
	 * Computes the totals of each candidates votes
	 * and fills the totals array with the total
	 * number of votes
	 * 
	 * @param votes		The votes array
	 * @param totals	The totals array
	 * @param n			The number of rows
	 * @param m			The number of columns
	 */
	public static void computeTotals(int[][] votes, int[] totals, int n, int m)
	{
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				totals[j] += votes[i][j];
			}
		}
	} // End computeTotals
	
	/**
	 * Prints votes by precinct and totals for each candidate
	 * 
	 * @param votes		Totals array (int)
	 * @param names		Totals array (String)
	 * @param totals	Totals array (int)
	 * @param p			Number of precincts
	 * @param c			Number of candidates
	 */
	public static void printByPrecinct(int[][] votes, String[] names, int[] totals, int p, int c)
	{
		System.out.println("                Votes by Precinct");
		
		System.out.printf("%-12s", "Precinct");
		for (int i = 0; i < c; i++)
		{
			System.out.printf("%-10s",names[i]);
		}
		System.out.println();
		
		for (int i = 0; i < p; i++)
		{
			System.out.printf("%4d  ", i+1);
			for (int j = 0; j < c; j++)
			{
				System.out.printf("%10d", votes[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("Totals");
		for (int i = 0; i < c; i++)
		{
			System.out.printf("%10d",totals[i]);
		}
		System.out.println();
		System.out.println();
		
	} // End printByPrecinct
	
	/**
	 * Prints the results of the voting
	 * 
	 * @param totals		The totals array
	 * @param names			The names array
	 * @param currentSize	The current size of the two arrays (should be equal)
	 */
	public static void printResults(int[] totals, String[] names, int currentSize)
	{
		selectionSort(totals, names, currentSize);
		
		System.out.println("FINAL RESULTS (IN DESCENDING ORDER OF VOTE TOTALS)");
		
		for (int i = 0; i < currentSize; i++)
		{
			System.out.printf("%-12s", names[i]);
			System.out.printf("%12d", totals[i]);
			System.out.println();
		}
		
	}
	
	/**
	 * Arranges two partially filled arrays of ints in descending order
	 * 
	 * @param a 	An array of integers
	 * @param names An array of strings
	 * @param n 	Current size of the arrays (should be equal)
	 */
	public static void selectionSort(int[] a, String[] names, int n)
	{
		int i;			// Counter for sorting
		int maxPos;		// The maximum position
		int temp;		// Temporary variable for the swap
		
		String tempName;
		
		for (i = 0; i < n - 1; i++)
		{
			maxPos = maximumPosition(a, i, n);
			
			temp = a[i];
			a[i] = a[maxPos];
			a[maxPos] = temp;
			
			tempName = names[i];
			names[i] = names[maxPos];
			names[maxPos] = tempName;
		}
	} // End selectionSort
	
	/**
	 * Find the maximum value in a sublist of an array and return its
	 * index.
	 * 
	 * @param a 	An array of integers
	 * @param from 	The beginning position of a sublist of a
	 * @param n		The number of elements in a partially filled array a
	 * @return		The index of the maximum
	 */
	public static int maximumPosition(int[] a, int from, int n)
	{
		int maxPos = from;
		int i;
		for (i = from + 1; i < n; i++)
		{
			if (a[i] > a[maxPos])
			{
				maxPos = i;
			}
		}
		return maxPos;
	} // End maximumPosition
	
} // End class
