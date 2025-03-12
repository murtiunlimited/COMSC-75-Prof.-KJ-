/*
* Murtaza Hussain
* February 24, 2025
* Assignment 7: Perimeter of Triangle
* This program prompts the user for side lengths of a triangle
* Then the program calculates the perimeter if measurements are valid
*/

import java.util.Scanner;

public class Triangle {
	
	//Method to get a valid side length from the user
	public static double getLength(Scanner scanner) {
        System.out.print("Enter the length of a side of the triangle: ");
        double length = scanner.nextDouble();
       
        //Loop until a valid positive length is entered 
        while (length <= 0) {
            System.out.print("The length must be positive. Try again: ");
            length = scanner.nextDouble();
        }

        return length;
    }
	
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Assign triangle side lengths to variables
		double side1 = getLength(scanner);
        double side2 = getLength(scanner);
        double side3 = getLength(scanner);
        
        //Check if sides form a valid triangle
        boolean condition1 = side1 + side2 > side3;
		boolean condition2 = side2 + side3 > side1;
		boolean condition3 = side1 + side3 > side2;
        
        if (condition1 && condition2 && condition3) {	
			//Find the perimeter
			double perimeter = side1 + side2 + side3;
			System.out.printf("The perimeter of the triangle is %.2f.%n", 
			                  perimeter);
		}
		else {
			System.out.println("Those sides do not specify a valid triangle.");
		}
		
		//Closing Scanner object to prevent memory leaks
		scanner.close();
	}
}
