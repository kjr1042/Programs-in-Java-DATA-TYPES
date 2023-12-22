// Cylinder Surface Area Formula A=2*pi*r*(r+h)
import java.util.Scanner;

public class cylinderSurfaceArea {

	public static void main(String[] args) {
		double pi =3.142;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of cylinder: ");
		float radius=scan.nextFloat();
		System.out.println("Enter the height of cylinder: ");
		float height=scan.nextFloat();
		
		double SurfaceArea = 2*pi*radius*(radius+height);
		System.out.printf("cylinderSurfaceArea = " +"%.4f", SurfaceArea);


	}

}
