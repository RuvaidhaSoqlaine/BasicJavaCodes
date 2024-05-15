package revision;

import java.util.Scanner;

public class PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		
		if(n==0) {
			System.out.println("The number is zero");
		}
		else if(n>0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative");
		}
	}

}
