// formula for Perimeter of Square =4*side
import java.util.Scanner;

public class squarePerimeter {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the side of Square: ");
		int side=scan.nextInt();
		int perimeter = 4*side;
		System.out.println("SquarePerimeter = " + perimeter);

	}

}
