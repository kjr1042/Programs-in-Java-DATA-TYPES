// formula for Perimeter of rectangle =2*(length +breadth)
import java.util.Scanner;

public class rectanglePerimeter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of length: ");
		int length=scan.nextInt();
		System.out.println("Enter the value of breadth: ");
		int breadth=scan.nextInt();
		int perimeter = 2*(length +breadth);
		System.out.println("rectanglePerimeter = " + perimeter);

	}

}
