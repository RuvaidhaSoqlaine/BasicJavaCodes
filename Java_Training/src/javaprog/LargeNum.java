package javaprog;

import java.util.Scanner;

public class LargeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[5];
		System.out.println("Enter the numbers:");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
			int a=arr[0];
			for(int lar : arr) {
				if(lar>a) {
					a=lar;
				}
			}
			System.out.println("Largest number is:" +a);

		}

	}



//another method get 2 inpts and comapare those 2 values.