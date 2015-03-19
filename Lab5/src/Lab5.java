import java.util.Scanner;

/**
 * 		Lab 5
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 1/28/2015
 * 		
 * 		Calculate the change a cashier needs to give back.
 *
 */

public class Lab5 {

	public static void main(String[] args) {
		
		int amountDue;			// The amount the customer owes, in pennies
		int amountReceived;		// The amount the customer gives, in pennies
		
		int change;				// Calculated difference between the owed and received amoung
		int dollars; 			// Calculated dollars to give back
		int quarters; 			// Calculated quarters to give back
		int dimes; 				// Calculated dimes to give back
		int nickels; 			// Calculated nickels to give back
		int pennies; 			// Calculated pennies to give back
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the amount due: ");
		amountDue = input.nextInt();
		
		System.out.print("Please enter the amount received: ");
		amountReceived = input.nextInt();
				
		change = amountReceived - amountDue;
		
		dollars = change / 100;
		change %= 100;
		quarters = change / 25;
		change %= 25;
		dimes = change / 10;
		change %= 10;
		nickels = change / 5;
		pennies = change % 5;
		
		System.out.printf("Dollars = %d\n", dollars);
		System.out.printf("Quarters = %d\n", quarters);
		System.out.printf("Dimes = %d\n", dimes);
		System.out.printf("Nickels = %d\n", nickels);
		System.out.printf("Pennies = %d\n", pennies);
		
		input.close();
	}
}
