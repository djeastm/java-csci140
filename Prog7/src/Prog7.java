/**
 * 		Prog7
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 4/9/2015
 * 		
 * 		Takes in a data file with student info and
 * 		offers options to display the data, search for
 * 		students by ID, and insert a new student record
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prog7 
{

	public static void main(String[] args) 
	{
		int[] id = new int[50];				// ID Numbers
		String[] name = new String[50];		// Full Names
		double[] gpa = new double[50];		// GPAs
		
		int numStudents = getData(id, name, gpa); 	// Number of students in data
		
		int choice = 0;						// User's choice
		Scanner input = new Scanner(System.in);
		do 
		{
			choice = getChoice();
			switch (choice) 
			{
			case 1:	
				printList(numStudents, name, id, gpa); 
				break;
			case 2: 
				setupSearch(id, name, gpa);
				break;
			case 3: 
				insertStudent(id, name, gpa, numStudents);
				numStudents++;
				break;
			case 4: break;
			default: 
				System.out.println("Incorrect choice");
				break;
			}
		}
		while (choice != 4);
		
	} // End main
	
	/**
	 * Processes a data file and enters data into input arrays 
	 * 
	 * @param id	ID number array
	 * @param name	Name array
	 * @param gpa	GPA array
	 * @return 		The number of students in the data file
	 */
	public static int getData(int[] id, String[] name, double[] gpa)
	{
		File inputFile = new File("prog7.txt");
		Scanner input = new Scanner(System.in);
		try {
			input = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int numStudents = 0; 
		
		while (input.hasNext())
		{
			id[numStudents] = input.nextInt();
			String lastName = input.next();
			String firstName = input.next();
			String middleName = input.next();
			name[numStudents] = lastName + " " + firstName + " " + middleName;
			gpa[numStudents] = input.nextDouble();
			
			numStudents++;
		}
		
		return numStudents;
		
	} // End getData
	
	
	/**
	 * Gets the choice from the user and returns the choice
	 * 
	 * @return Returns the user's choice
	 */
	public static int getChoice()
	{
		Scanner input = new Scanner(System.in);
		int choice;
		
		System.out.println("Choose an option:");
		System.out.println("1.	Display");
		System.out.println("2.	Search");
		System.out.println("3.	Insert");
		System.out.println("4.	Quit");
		System.out.println();
		System.out.print("Your choice: ");
		System.out.println();
		choice = input.nextInt();
		
		return choice;
	} // End getChoice
	
	/**
	 * Prints arrays in a column format
	 * 
	 * @param numEntries 	The number of entries in the parallel arrays
	 * @param col1 			First array
	 * @param col2 			Second array
	 * @param col3 			Third array
	 */
	public static void printList(int numEntries, String[] col1, int[] col2, double[] col3 ) 
	{
		System.out.printf("%-25s    %8s     %s\n", "NAME", "ID", "GPA");
		System.out.println();
		for (int i = 0; i < numEntries; i++)
		{
			System.out.printf("%-25s    %8d     %.2f\n", col1[i], col2[i], col3[i]);
		}
		System.out.println();
	} // End printList
	
	/**
	 * Sets up the search and gives user feedback
	 * 
	 * @param id	The id array
	 * @param name	The name array
	 * @param gpa	The gpa array
	 */
	public static void setupSearch(int[] id, String[] name, double[] gpa) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an ID to search for");
		int target = input.nextInt();
		int idNum = search(id, target);
		if (idNum != -1)
		{
			System.out.printf("%-25s     %.2f\n", name[idNum], gpa[idNum]);
		}
		else
		{
			System.out.println("ID NOT FOUND");
		}
		System.out.println();
	} // End setupSearch
	
	/**
	 * Searches for a student ID in an array
	 * 
	 * @param array		The array to be searched
	 * @param target 	The target ID
	 * @return 			The location of the located student entry
	 */
	public static int search(int[] array, int target) 
	{
		int location = 0;
		
		while (location < array.length)
		{
			if (array[location] == target)
			{
				return location;
			}
			
			location++;
		}
		
		return -1;
	} // End search
	
	/**
	 * Inserts a student into the set of parallel arrays
	 * 
	 * @param id			Student ID numbers
	 * @param name			Student names
	 * @param gpa			Student GPAs
	 * @param currentEntry	The location of the last entry
	 */
	public static void insertStudent (int[] id, String[] name, double[] gpa, int currentEntry) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter last name");
		String lastName = input.next();
		System.out.println("Please enter first name");
		String firstName = input.next();
		System.out.println("Please enter middle name");
		String middleName = input.next();
		name[currentEntry] = lastName + " " + firstName + " " + middleName;
		System.out.println("Please enter ID");
		id[currentEntry] = input.nextInt();
		System.out.println("Please enter GPA");
		gpa[currentEntry] = input.nextDouble();
		System.out.println("Student Record Inserted");
		System.out.println();
	} // End insertStudent
	
	
} // End class
