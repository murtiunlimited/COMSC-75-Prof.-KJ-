/*
 * Murtaza Hussain
 * February 24, 2025
 * Assignment 6: Comparing costs for charging an electric car
 * This program asks the user for the number of minutes to charge his car
 * Then the program calculates which company offers a cheaper price
 */

import java.util.Scanner;

public class ChargeCompare {

    public static double calculateCost(int minutes, int minuteLimit, 
            double rateBeforeLimit, double rateAfterLimit) {
        double cost = 0.0;

        if (minutes <= minuteLimit) {
            // Price if charging minutes do not exceed minute limit
            cost = minutes * rateBeforeLimit;
        } else {
            // Price if charging minutes are above minute limit
            cost = (minuteLimit * rateBeforeLimit) + 
                ((minutes - minuteLimit) * rateAfterLimit);
        }

        cost = Math.round(cost * 100.0) / 100.0;
        return cost;
    }

    public static void main(String[] args) {
        final int EV_MIN_LIMIT = 15;
        final double EV_PRICE_BEFORE = 0.27;
        final double EV_PRICE_AFTER = 0.30;

        final int ELEKTRA_MIN_LIMIT = 20;
        final double ELEKTRA_PRICE_BEFORE = 0.25;
        final double ELEKTRA_PRICE_AFTER = 0.35;

        Scanner scanner = new Scanner(System.in);

        // Asking User for amount of minutes required for charging
        System.out.println(
			"Enter number of minutes you want to charge your vehicle");
        int minutes = scanner.nextInt();

        if (minutes < 0) {
            // End program if negative minutes are entered
            System.out.println("You can not have negative minutes.");
        } else {
            // Calculate Price for EV Dynamics
            double costDynamics = calculateCost(minutes, EV_MIN_LIMIT, 
                                  EV_PRICE_BEFORE, EV_PRICE_AFTER);

            // Calculate Price for ElektraCharge
            double costElektra = calculateCost(minutes, ELEKTRA_MIN_LIMIT, 
                                 ELEKTRA_PRICE_BEFORE, ELEKTRA_PRICE_AFTER);

            // Display result for how much each company charges 
            System.out.printf("Cost for EV Dynamics: $%.2f%n", costDynamics);
            System.out.printf("Cost for ElektraCharge: $%.2f%n", costElektra);

            // Display which company charges for cheaper
            if (costDynamics < costElektra) {
                System.out.println("EV Dynamics is cheaper.");
            } else if (costElektra < costDynamics) {
                System.out.println("ElektraCharge is cheaper.");
            } else {
                System.out.print("Both charging stations cost the same.");
            }
        }

        scanner.close();
    }
}
