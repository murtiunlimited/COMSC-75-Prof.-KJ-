import java.util.Scanner;

public class Statistics {

    // Method to calculate the standard deviation of the prices
    public static double calculateStandardDeviation(double sumPrice, 
        double sumPriceSquared, int count) {
            
        double sumSquaredCount = count * sumPriceSquared;
        double priceSquaredSum = sumPrice * sumPrice;
        double countFactor = count * (count - 1);

        // Calculating variance using the formula
        double variance = (sumSquaredCount - priceSquaredSum) / countFactor;

        return Math.sqrt(variance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initializing values required to find standard deviation
        double sumPrice = 0;
        double sumPriceSquared = 0.0;
        int count = 0;
        double price = 0;

        // Loop that keeps asking for prices until -1 is entered 
        while (price != -1) {
            System.out.print("Enter first price, or -1 to quit: $");
            price = scanner.nextDouble();

            if (price != -1) {
                // Update initialized variables to find standard deviation
                sumPrice += price;
                sumPriceSquared += (price * price);
                count++;
            }
        }

        // Display error message if no prices are entered
        if (count == 0) {
            System.out.println("Number of items: 0");
            System.out.println("No data entered. Cannot calculate statistics.");
        }

        // Only display Average if only one price is entered
        else if (count == 1) {
            System.out.println("Number of items: 1");
            System.out.printf("Average price is $%.2f%n", sumPrice);
            System.out.println("Cannot calculate standard deviation for one item.");

        // Display both average and standard deviation if more than 1 price is entered  
        } else {
            // Calculating the average
            double average = sumPrice / count;

            // Calculate the standard deviation
            double stdDeviation = calculateStandardDeviation(sumPrice, sumPriceSquared, count);

            System.out.printf("Number of items: %d%n", count);
            System.out.printf("Average price is $%.2f%n", average);
            System.out.printf("Standard deviation of prices is $%.2f%n", stdDeviation);
        }

        scanner.close();
    }
}
