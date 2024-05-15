package resource;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Print a");
		a=sc.nextInt();
		System.out.println("Print b");
		b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Swap of two number: "  +a + " " +b);
	}

}
