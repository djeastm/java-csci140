/**
 * 		Test 3
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 4/27/2015
 * 		
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test3 
{

	public static void main(String[] args) 
	{
		File inputFile = new File("test3.txt");
		Scanner input = new Scanner(System.in);
		try {
			input = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		double[] rain = new double[50];
		int n = 0;
		while (input.hasNext())
		{
			rain[n] = input.nextDouble();
			n++;
		}
		
		double avg = computeAve(rain, n);
		
		System.out.printf("Average Rainfall = %.2f\n\n", avg);
		
		System.out.printf("%-20s%-20s\n", "Rainfall Amount", "Deviation From Average");
		for (int i = 0; i < n; i++)
		{
			System.out.printf("%10.2f             %10.2f\n", rain[i], rain[i] - avg);
		}
		System.out.println();
		
		reverse_print(rain, n);
		
	} // End main
	
	public static double computeAve(double[] a, int n)
	{
		double sum = 0;
		double avg = 0;
		
		for (int i = 0; i < n; i++) 
		{
			sum += a[i];
		}
		
		avg = sum / n;
		
		return avg;
	} // End computeAve
	
	public static void reverse_print(double[] a, int n)
	{
		System.out.println("Rainfall Amounts in Reverse");
		
		for (int i = n-1; i >= 0; i--)
		{
			System.out.printf("%3.1f ", a[i]);
		}
	} // End reverse_print
	
	
} // End class
