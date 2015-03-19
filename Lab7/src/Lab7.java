import java.util.Scanner;

/**
 * 		Lab 7
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 2/4/2015
 * 		
 * 		Calculates a user's body mass index, categorizes it as a weight status,
 * 		and prints the results.
 *
 */

public class Lab7 {

	public static void main(String[] args) {
		
		double weight;				// User's weight in pounds
		
		double heightFeet;			// Calculated height feet value
		double heightInches;		// Calculated height inches	value	
		double height;				// Calculated height, in inches
		double bodyMassIndex;		// Calculated Body Mass Index
		String weightStatus;		// Determined Weight Status
				
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your weight: ");
		weight = input.nextInt();
		
		System.out.print("Please enter your height: ");
		heightFeet = input.nextDouble();
		heightInches = input.nextDouble();
		
		height = (heightFeet*12.0)+heightInches;
		
		bodyMassIndex = (703*weight)/Math.pow(height,2);
		
		if (bodyMassIndex < 18.5) {
			weightStatus = "Underweight";
		} else if (bodyMassIndex < 24.99) {
			weightStatus = "Normal";
		} else if (bodyMassIndex < 29.99) {
			weightStatus = "Overweight";
		} else {
			weightStatus = "Obese";
		}
		
		// Results
		
		System.out.printf("Your BMI: %.1f \n", bodyMassIndex);
		System.out.println("Your Weight Status: " + weightStatus);
				
		input.close();
	}
}
