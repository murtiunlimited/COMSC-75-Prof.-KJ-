/*
 * Murtaza Hussain
 * February 19, 2025
 * Assignment 5: Cost Of Shipping
 * This program prompts the user to enter weight for a package
 * Then the program calculates the cost for shipping the package
 * When the weight is invalid, an error message is displayed
 */ 
 
import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Asking for user input
        System.out.print("Enter weight of package in pounds: ");
        double weight = scanner.nextDouble();

        // Initializing the cost
        double cost = 0.0;

        // Applying conditions for cost of the package
        if (weight <= 0) {
			// Show error message and terminate program for invalid input
            System.out.println("Weight must be greater than zero.");
        } 
        
        else if (weight > 25) {
            System.out.println("Cannot ship - maximum weight is 25 pounds.");
        } 
        
        else {
			//Determing the cost
            if (weight <= 2) {
                cost = 3.50;
                
            } else if (weight <= 8) {
                cost = 5.70;
                
            } else if (weight <= 17) {
                cost = 9.50;
                
            } else {
                cost = 12.35;
            }
            
            // Displaying the result corrected to 2 decimal places
			System.out.printf("Cost: $%,.2f%n", cost);
        }
 
        //Close scanner to prevent memory leaks
        scanner.close();
    }
}
