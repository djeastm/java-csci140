import java.util.Scanner;

/**
 * 		Lab 6
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 2/2/2015
 * 		
 * 		Prompts the user for file path information and prints it as a formatted 
 * 		file path. Also prompts the user for a telephone number and prints it as a
 * 		formatted telephone number.
 *
 */

public class Lab6 {

	public static void main(String[] args) {
		
		String driveLetter;			// The letter of the drive
		String path;				// The file path, including backslashes
		String fileName;			// The name of the file
		String extension;			// The file extension
		
		String partA;				// Calculated formatted file path;
		
		String inputPhoneNumber;	// The phone number, ten-digits unformatted
		String areaCode;			// Calculated substring of phone number, first three numbers
		String prefix;				// Calculated substring of phone number, second three numbers
		String suffix;				// Calculated substring of phone number, last four numbers
		
		String partB;				// Calculated formatted phone number;
				
		Scanner input = new Scanner(System.in);
		
		// Part A
		
		System.out.print("Please enter the drive letter: ");
		driveLetter = input.next();
		
		System.out.print("Please enter the path: ");
		path = input.next();
		
		System.out.print("Please enter the file name: ");
		fileName = input.next();
		
		System.out.print("Please enter the extension: ");
		extension = input.next();
		
		partA = driveLetter+":"+path+"\\"+fileName+"."+extension;
		
		// Part B
		
		System.out.print("Please enter a ten-digit phone number: ");
		inputPhoneNumber = input.next();	
		
		areaCode = inputPhoneNumber.substring(0,3);
		prefix = inputPhoneNumber.substring(3,6);
		suffix = inputPhoneNumber.substring(6,10);
		
		partB = "("+areaCode+") "+prefix+"-"+suffix;
		
		// Results
		
		System.out.println("Results of Part A: " + partA);
		System.out.println("Results of Part B: " + partB);
				
		input.close();
	}
}
