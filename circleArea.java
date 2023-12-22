
// formula for area of circle =pi*radius*radius, where pi=3.14
import java.util.Scanner;

public class circleArea {

	public static void main(String[] args) {
		double pi =3.14;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		float radius=scan.nextFloat();
		double area = pi*(radius*radius);
		System.out.println("Area of Circle = " + area);


	}

}
