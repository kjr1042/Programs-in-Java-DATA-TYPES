import java.util.Scanner;

public class add2integers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=scan.nextInt();
		System.out.println("Enter the value of b: ");
		int b=scan.nextInt();
		int add=a+b;
		System.out.println("result = " +add);
	}

}
