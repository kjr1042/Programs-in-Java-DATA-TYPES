import java.util.Scanner;

public class dollarToRupeeConversion {

	public static void main(String[] args) {
		// 1 dollar = 82.73 INR
		double dollarRate =82.73;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the dollar :");
		int dollars =scan.nextInt();
		double rupee =dollarRate *dollars;
		System.out.printf( "Dollar to rupee : " + "%.4f" , rupee);

	}

}
