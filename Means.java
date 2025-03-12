import java.util.Scanner;

public class Means {
	
	// Method to find reciprocal
	public static double reciprocal(double x) {
		return 1.0 / x;
	}
	
	// Method for Arithemic Mean
	public static double arithmeticMean(double num1,
	    double num2, double num3) {
		double sum = num1 + num2 + num3;
		return sum / 3;
	}
		
	// Method for Geometric Mean
   public static double geometricMean(double num1, double num2, double num3) {
        double product = num1 * num2 * num3;
        return Math.pow(product, 1.0 / 3.0);
    }

    // Method for Harmonic Mean
    public static double harmonicMean(double num1, double num2, double num3) {
			
        double reciprocal1 = reciprocal(num1);
        double reciprocal2 = reciprocal(num2);
        double reciprocal3 = reciprocal(num3);
        double arit_mean = arithmeticMean(reciprocal1, reciprocal2, reciprocal3);
        
        return reciprocal(arit_mean);
    }
    
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Ask For User Input
		System.out.println("Enter first number: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter second number: ");
		double num2 = scanner.nextDouble();

		System.out.println("Enter third number: ");
		double num3 = scanner.nextDouble();
		
		// Calling Methods 
		double aritemic_mean = arithmeticMean(num1, num2, num3);
		double geometric_mean = geometricMean(num1, num2, num3);
		double harmonic_mean = harmonicMean(num1, num2, num3);
		
		// Displaying Calculated Values of Means
        System.out.printf("Arithmetic Mean: %.2f%n", aritemic_mean);
        System.out.printf("Geometric Mean: %.2f%n", geometric_mean);
        System.out.printf("Harmonic Mean: %.2f%n", harmonic_mean);
        scanner.close();
	}
}

