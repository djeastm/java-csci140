/**
 * 		Test 1
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 2/18/2015
 * 		
 *
 */
import java.util.Scanner;

public class Test1 
{

	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		// Part 1
		
		double radius;
		double volume;
		
		System.out.println("Input the radius of a sphere: ");
		radius = input.nextDouble();
		
		volume = ((double) 4 / 3) * Math.PI * Math.pow(radius, 3);
		
		System.out.printf("The volume of a sphere with radius %7.3f is %7.3f.\n", radius, volume);
		
		// Part 2
		
		double gpa;
		String status;
		
		System.out.println("Input a GPA: ");
		gpa = input.nextDouble();
		
		if (gpa >= 3.5) {
			status = "Dean's List";
		} else if (gpa >= 2.0) {
			status = "Good Standing";
		} else {
			status = "Probation";
		}
		
		System.out.println(status);
		
		// Part 3
		
		String sourceString;
		String subString;
		
		System.out.println("Input a string from which to take a substring: ");
		sourceString = input.next();
		
		if (sourceString.length() >= 3) {
			subString = sourceString.substring(0,3);
			System.out.println(subString);
		} else {
			System.out.println("ERROR");
		}
				
		input.close();
	}
}
