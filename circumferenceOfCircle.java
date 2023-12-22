// formula for Circumference of Circle  =2*pi*radius ,where pi=3.14
import java.util.Scanner;

public class circumferenceOfCircle {

	public static void main(String[] args) {
		double pi =3.14;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		float radius=scan.nextFloat();
		double Circumference = 2*pi*radius;
		System.out.println("Circumference of Circle = " + Circumference);

	}

}
