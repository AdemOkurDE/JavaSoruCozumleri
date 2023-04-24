package s01_javaGiris;

import java.util.Scanner;

public class S01_JavaSOUT {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello\n\t\"World\"" + Math.pow(3,5)); // Math.pow(a,b) = a^b (a üssü b) islemi yapar

        /*
		 	Ask user to enter a number.
		 	If the number is less than 10 and greater than or equal to 0, calculate its cube.
		 	Otherwise, calculate its square.
					Cube of a = a*a*a           Square of a = a*a

					Math.pow(a,b) = a^b (a üssü b) islemi yapar
		*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number...");
        double a = scanner.nextDouble();

        String result = a>=0 && a<10 ? "Cube: " + Math.pow(a, 3) : "Square: " + Math.pow(a, 2);
        System.out.println(result);
    }
}
