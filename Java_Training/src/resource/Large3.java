package resource;

import java.util.Scanner;

public class Large3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Print a");
		a=sc.nextInt();
		System.out.println("Print b");
		b=sc.nextInt();
		System.out.println("Print c1");
		c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(" a is large");
		}
			else if(b>a && b>c) {
				System.out.println("b is large");
			}

			else {
				System.out.println("c is large");
			}
	}

}
