package revision;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to check: ");
		n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+ " is even");
		}
		else {
			System.out.println(n+ " is odd");
		}
		
	}

}
