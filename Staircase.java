
import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Staircase Volume Calculator");
        
        // Inputting Measurements
        System.out.print("How many steps in the staircase? ");
        int steps = scanner.nextInt();
        
        System.out.print("Enter step width in cm: ");
        double width = scanner.nextDouble();
        
        System.out.print("Enter rise of the step in cm: ");
        double rise = scanner.nextDouble();
        
        System.out.print("Enter run of the step in cm: ");
        double run = scanner.nextDouble();
        
        // Calculating Volume 
        double volume = width * rise * run * (steps * (steps + 1) / 2 );
      
		// Casting Volume As Integer
        int volume_rounded = (int) (Math.ceil(volume));
        
        // Volume of Staircase
        System.out.printf("Total Volume is %,d cubic centimeters." , volume_rounded);
	}
}

