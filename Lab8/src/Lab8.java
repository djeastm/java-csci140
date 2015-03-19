import java.util.Scanner;

/**
 * 		Lab 8
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 2/6/2015
 * 		
 * 		Reads in temperature value and the letter C for Celsius
 * 		or F for Fahrenheit. Prints whether water is liquid, solid, or
 * 		gaseous at the given temperature at sea level.
 *
 */

public class Lab8 {

	public static void main(String[] args) {
		
		int temp;								// User-entered temperature
		String scale;							// User-entered temperature scale
		
		String waterForm = "undetermined";		// Determined water form
				
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a water temperature: ");
		temp = input.nextInt();
		scale = input.next();
					
		if (scale.equals("F") || scale.equals("f")) {
			if (temp >= 212) waterForm = "gaseous";
			else if (temp > 32) waterForm = "liquid";
			else waterForm = "solid";
		} else if (scale.equals("C") || scale.equals("c")) {
			if (temp >= 100) waterForm = "gaseous";
			else if (temp > 0) waterForm = "liquid";
			else waterForm = "solid";
		} else {
			System.out.println("Please enter a valid scale");
		}
		
		// Results
		
		System.out.println("The water is "+waterForm+".");
				
		input.close();
	}
}
