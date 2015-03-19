/**
 * 		Program 2
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 2/6/2015
 * 		
 * 		Calculates lengths of the sides of a given triangle, 
 * 		then calculates the area and the perimeter.
 *
 */
import java.util.Scanner;

public class Prog2 
{

	public static void main(String[] args) 
	{
		
		double xA;				// X value for Vertex A
		double yA;				// Y value for Vertex A
		double xB;				// X value for Vertex B
		double yB;				// Y value for Vertex B
		double xC;				// X value for Vertex C
		double yC;				// Y value for Vertex C
		
		double lengthAB;		// Calculated length of side AB
		double lengthBC;		// Calculated length of side BC
		double lengthAC;		// Calculated length of side AC
		
		double s;				// Calculated semiperimeter of the triangle
		double area;			// Calculated area of the triangle
		double perimeter;		// Calculated perimeter of the triangle
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the coordinates for vertex A: ");
		xA = input.nextDouble();
		yA = input.nextDouble();
		
		System.out.print("Input the coordinates for vertex B: ");
		xB = input.nextDouble();
		yB = input.nextDouble();
		
		System.out.print("Input the coordinates for vertex C: ");
		xC = input.nextDouble();
		yC = input.nextDouble();
		
		lengthAB = Math.sqrt(Math.pow((xB-xA),2) + Math.pow((yB-yA),2));
		lengthBC = Math.sqrt(Math.pow((xC-xB),2) + Math.pow((yC-yB),2));
		lengthAC = Math.sqrt(Math.pow((xA-xC),2) + Math.pow((yA-yC),2));
		
		s = 0.5*(lengthAB + lengthBC + lengthAC);
		area = Math.sqrt(s*(s-lengthAB)*(s-lengthBC)*(s-lengthAC));
		perimeter = lengthAB + lengthBC + lengthAC;
			
		// Results
		
		System.out.println("");
		System.out.printf("Vertex A: %10.2f %4.2f\n", xA, yA);
		System.out.printf("Vertex B: %10.2f %4.2f\n", xB, yB);
		System.out.printf("Vertex C: %10.2f %4.2f\n", xC, yC);
		System.out.println("");
		System.out.printf("Length AB:%15.2f\n", lengthAB);
		System.out.printf("Length BC:%15.2f\n", lengthBC);
		System.out.printf("Length AC:%15.2f\n", lengthAC);
		System.out.println("");
		System.out.printf("Area:     %15.2f\n", area);
		System.out.printf("Perimeter:%15.2f\n", perimeter);
				
		input.close();
	}
}
