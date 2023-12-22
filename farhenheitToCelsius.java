//The formula for converting Fahrenheit to Celsius is C = 5/9(F-32)

import java.util.Scanner;

public class farhenheitToCelsius {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Farhenheit :");
		float Farhenheit=scan.nextFloat();
		float farhenheitToCelsius= (5/9f *(Farhenheit-32));
		System.out.printf("farhenheitToCelsius = "+"%.4f",farhenheitToCelsius);

	}

}
