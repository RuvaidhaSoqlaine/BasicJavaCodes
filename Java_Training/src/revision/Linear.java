package revision;

import java.util.Scanner;

public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int n,k;
		System.out.println("Enter the numbers");
		n=sc.nextInt();
		System.out.println("Enter those numbers:");
		int[] arr= new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int num;
		System.out.println("Enter the number to search from an array");
		num=sc.nextInt();
		for(k=0;k<arr.length;k++) {
			if(k==num) {
				System.out.println("The number is found: " +num);
				break;
			}
		}

			if(k==n)
			{
				System.out.println("The number is not found from an array");
			}
		

	}
}
