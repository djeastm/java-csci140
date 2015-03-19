/**
 * 		Lab 15
 * 		CSCI 140L
 * 		
 * 		@author David Eastman
 * 		Last Revised: 3/2/2015
 * 		
 * 		A bunch of for loops
 *
 */

import java.util.Scanner;

public class Lab15
{

	public static void main(String[] args)
	{
		int	n = 0;				// A user-entered integer
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		n = input.nextInt();
		
		System.out.println("Part 1:");
		for (int i = 1; i <= n; i++)
		{

			System.out.println(i);
		}
		
		System.out.println();
		
		System.out.println("Part 2:");
		
		for (int i = 1; i <= n; i++)
		{
			int intSquared = i*i;

			System.out.printf("%d    %d\n",i, intSquared);
		}
		
		System.out.println();
		
		System.out.println("Part 3:");
		for (int i = n; i >= 1; i--)
		{

			System.out.println(i);
		}
		
		System.out.println();
		
		System.out.println("Part 5:");
		int sum = 0;
		for (int i = 1; i <= n; i++)
		{
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println();
		
		System.out.println("Part 6:");
		int product = 1;
		for (int i = 1; i <= n; i++)
		{
			product *= i;
		}
		System.out.println(product);
		
		System.out.println();
		
		System.out.println("Part 7:");
		System.out.printf("Please enter %d integers:\n", n);
		int sum2 = 0;
		for (int i = 1; i <= n; i++)
		{
			sum2 += input.nextInt();
		}
		System.out.println(sum2);
		
		System.out.println();
		
		System.out.println("Part 8:");
		System.out.println("Please enter two integers:");
		int a = input.nextInt();
		int b = input.nextInt();
		
		for (int i = a; i <= b; i++)
		{
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		input.close();
	}
}
