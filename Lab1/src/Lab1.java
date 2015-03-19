import java.util.Scanner;

/**
 * 		Lab1
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 1/14/2015
 * 		
 * 		Compute the volume of a six-pack of soda and the total volume of 
 * 		several 2-liter bottles of soda and one six-pack.
 *
 */

public class Lab1 {

	public static void main(String[] args) 
	{
		int cansPerPack;				// Cans in one pack
		double packVolume; 					// Volume of one pack
		double totalVolume;					// Pack volume plus bottle volume
		int numberOfBottles;			// Number of two-liter bottles
		final double CAN_VOLUME = 0.355;	// Liters in a 12-ounce can
		final double BOTTLE_VOLUME = 2;		// Two-liter bottle

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of cans per pack: ");
		cansPerPack = input.nextInt();
		
		System.out.print("Enter the number of bottles: ");
		numberOfBottles = input.nextInt();
		
		
		// Compute volume of a pack
		packVolume = cansPerPack * CAN_VOLUME;
		System.out.print("A "+cansPerPack+"-pack of 12-ounce cans contains ");
		System.out.print(packVolume);
		System.out.println(" liters.");
		
		// Add the volume of the bottles to the previous total
		totalVolume = packVolume + numberOfBottles * BOTTLE_VOLUME;
		System.out.print("A "+cansPerPack+"-pack and "+numberOfBottles+" two-liter bottle(s) contain ");
		System.out.print(totalVolume);
		System.out.println(" liters.");
	}
}
