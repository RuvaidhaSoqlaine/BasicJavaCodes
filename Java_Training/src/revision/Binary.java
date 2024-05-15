package revision;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 

		int n;
		int beg;
		int mid;   
		int end;
		System.out.println("Enter the numbers");
		n=sc.nextInt();
		System.out.println("Enter those numbers: ");
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		beg=arr[0];
		System.out.println("Beginning value is: " +beg);
		end=arr[n-1];
		System.out.println("End value is: " +end);
		
		int t;
		System.out.println("Enter the number to search: ");
		t=sc.nextInt();
		
		
		while(beg<=end) {
		mid=(beg+end)/2;
		if(t==mid) {
		System.out.println("value found :" +mid);
		break;
		}	
		else if(t>mid) {
			beg=mid+1;
		}
		else if(t<mid){
			end=mid-1;
		}
		}
		if(beg>end)
		 {
			System.out.println("Value is not found");
		}
		
	
}
	
}  

		                  

                                 