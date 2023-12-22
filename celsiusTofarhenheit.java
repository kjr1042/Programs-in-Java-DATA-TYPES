//The conversion formula for a temperature that is expressed on the Celsius (°C) scale to its Fahrenheit (°F) 
//formula is: °F = (9/5 × °C) + 32.

import java.util.Scanner;

public class celsiusTofarhenheit {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Celsius:");
		float celsius=scan.nextFloat();
		float celsiusTofarhenheit= (9/5f * celsius) + 32;
		System.out.println("celsiusTofarhenheit = " +celsiusTofarhenheit);


	}

}
