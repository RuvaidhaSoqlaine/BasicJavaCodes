package resource;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Print a");
		a=sc.nextInt();
		System.out.println("Print b");
		b=sc.nextInt();
		c=b;
		b=a;
		a=c;
		System.out.println("Swap of two number: " +a +" " +b);
		
	}

}
