import java.util.Scanner;

/**
 * 		Lab 4
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 1/26/2015
 * 		
 * 		Calculate the monthly payment on a loan and the 
 * 		total amount repaid.
 *
 */

public class Lab4 {

	public static void main(String[] args) {
		
		double loanAmount;			// The amount of the loan, in dollars
		double annualInterestRate;	// The annual interest rate, entered as percentage (e.g. 4.5)
		double term;				// The term of the loan, in months
		
		double monthlyInterestRate; // Calculated monthly interest rate
		double monthlyPayment;		// Calculated monthly payment on the loan, in dollars
		double repaidAmount;		// Calculated amount repaid
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the loan amount: ");
		loanAmount = input.nextDouble();
		
		System.out.print("Please enter the interest rate as a percentage: ");
		annualInterestRate = input.nextDouble();
		
		System.out.print("Please enter the term of the loan, in months: ");
		term = input.nextDouble();
		
		monthlyInterestRate = annualInterestRate / 1200;
		monthlyPayment = (loanAmount * monthlyInterestRate)/(1 - Math.pow(1 + monthlyInterestRate, -term));
		repaidAmount = monthlyPayment * term;
		
		System.out.printf("Monthly Payment = %13.2f\n", monthlyPayment);
		System.out.printf("Total Amount Repaid = %9.2f\n", repaidAmount);
		
		input.close();
	}

}
