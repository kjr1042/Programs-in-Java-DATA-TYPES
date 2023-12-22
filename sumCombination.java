//sample input : 2 4 6
//sample output: 6 8 10
//sample input : 20 30 50
//sample output: 50 70 80 

import java.util.Scanner;

public class sumCombination {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=scan.nextInt();
		System.out.println("Enter the value of b: ");
		int b=scan.nextInt();
		System.out.println("Enter the value of c: ");
		int c=scan.nextInt();
		int add1=a+b;
		int add2=a+c;
		int add3=b+c;
		System.out.println("result = " +add1);
		System.out.println("result = " +add2);
		System.out.println("result = " +add3);


	}

}
