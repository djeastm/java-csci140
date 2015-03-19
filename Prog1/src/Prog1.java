/**
 * 		Program 1
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 1/26/2015
 * 		
 * 		Calculates the area of a rectangular lot, house, garden, and grass and the amount
 *  	of time it takes to cut the grass, given length and width of the lot and house
 *  	and the diameter of the garden.
 *
 */

import java.util.Scanner;

public class Prog1 
{

	public static void main(String[] args) 
{
		
		double lengthOfLot;					// The length of the rectangular lot, in feet
		double widthOfLot;					// The width of the rectangular lot, in feet
		double lengthOfHouse;				// The length of the house, in feet
		double widthOfHouse;				// The width of the house, in feet
		double diameterOfGarden;			// The diameter of the circular garden, in feet
		final double CUTTING_RATE = 3.5;	// The rate at which you can cut grass, in sq ft per second
		
		double areaOfLot; 			// Calculated area of the rectangular lot
		double areaOfHouse;			// Calculated area of the house
		double areaOfGarden;		// Calculated area of the garden
		double areaOfGrass;			// Calculated area of the grass
		double timeToCutGrass;		// Calculated time to cut the grass
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the length of the rectangular lot, in feet: ");
		lengthOfLot = input.nextDouble();
		
		System.out.print("Please enter the width of the rectangular lot, in feet: ");
		widthOfLot = input.nextDouble();
		
		System.out.print("Please enter the length of the house, in feet: ");
		lengthOfHouse = input.nextDouble();
		
		System.out.print("Please enter the width of the house, in feet: ");
		widthOfHouse = input.nextDouble();
		
		System.out.print("Please enter the diameter of the circular garden: ");
		diameterOfGarden = input.nextDouble();

		areaOfLot = lengthOfLot * widthOfLot;
		
		areaOfHouse = lengthOfHouse * widthOfHouse;
		
		areaOfGarden = Math.PI * Math.pow(diameterOfGarden/2, 2); 
		
		areaOfGrass = areaOfLot - areaOfHouse - areaOfGarden;
		
		timeToCutGrass = (areaOfGrass / CUTTING_RATE) / 60;
		
		System.out.printf("Area of the rectangular lot: %.1f sq ft\n", areaOfLot);
		System.out.printf("Area of the house: %.1f sq ft\n", areaOfHouse);
		System.out.printf("Area of the garden: %.1f sq ft\n", areaOfGarden);
		System.out.printf("Area of the grass: %.1f sq ft\n", areaOfGrass);
		System.out.printf("Time to cut the grass: %.1f minutes\n", timeToCutGrass);
		
		input.close();
	}
}
