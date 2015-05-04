/**
 * 		Prog5
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 3/6/2015
 * 		
 * 		Allows a manager to calculate charges for several customers.
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Prog5 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		File inputFile = new File("prog5in.txt");
		Scanner input = new Scanner(inputFile);
		PrintWriter output = new PrintWriter("prog5out.txt");
		double totalRevenue = 0;
		
		while(input.hasNext())
		{
			final double REMOVALRATE = 150;		// Per tree rate for removing
			final double TRIMMINGRATE = 50; 	// Per hour rate for trimming
			final double GRINDINGRATE = 30; 	// Per stump flat rate (does not include surcharge;	
			final double GRINDINGSURCHARGE = 2;	// Surcharge for stumps with diameter greater than 12
			
			String customerName;			// Each name taken in from input file
			int treeCount = 0;				// Number of trees removed
			double trimHours = 0;			// Number of hours worked trimming
			double stumpCount = 0;			// Number of stumps ground.
			
			double removalCharge = 0;		// Calculated charge for removal
			double trimmingCharge = 0;		// Calculated charge for trimming
			double grindingCharge = 0;		// Calculated charge for grinding
			double stumpSurcharge = 0;		// Calculated surcharge for large stumps
			double totalCharge = 0;			// Calculated total charge
			
			customerName = input.nextLine();
			treeCount = input.nextInt();
			trimHours = input.nextDouble();
			input.nextLine();
			
			double diameter = input.nextDouble();
			while (diameter != -1)
			{
				if (diameter != -1) 
				{
					if (diameter > 12) 
					{
						stumpSurcharge += (diameter - 12) * GRINDINGSURCHARGE;
					} 
					
					stumpCount++;
					
					if (input.hasNextDouble()) 
					{
						diameter = input.nextDouble();
					}
				}
			}
			if (input.hasNext() ) 
			{
				input.nextLine();
			}
			
			removalCharge = treeCount * REMOVALRATE;
			trimmingCharge = trimHours * TRIMMINGRATE;
			grindingCharge = (stumpCount * GRINDINGRATE) + stumpSurcharge;
			totalCharge = removalCharge + trimmingCharge + grindingCharge;
			totalRevenue += totalCharge;
			
			// Print to console
			System.out.println("Customer:       " + customerName);
			System.out.printf ("Tree Removal:   $%9.2f\n", removalCharge);
			System.out.printf ("Tree Trimming:  $%9.2f\n", trimmingCharge);
			System.out.printf ("Stump Grinding: $%9.2f\n", grindingCharge);
			System.out.printf ("Total:          $%9.2f\n", totalCharge);
			System.out.println();
			
			// Print to file
			// Using System.lineSeparator so the output text file line breaks will work 
			// both on *nix and Windows machines
			String br = System.lineSeparator();
			output.println("Customer:       " + customerName);
			output.printf ("Tree Removal:   $%9.2f"+br, removalCharge);	
			output.printf ("Tree Trimming:  $%9.2f"+br, trimmingCharge);
			output.printf ("Stump Grinding: $%9.2f"+br, grindingCharge);
			output.printf ("Total:          $%9.2f"+br, totalCharge);
			output.println();
		}
		System.out.printf ("Total Revenue:  $%9.2f\n", totalRevenue);
		output.printf ("Total Revenue:  $%9.2f\n", totalRevenue);
		
		input.close();
		output.close();
	}
}
