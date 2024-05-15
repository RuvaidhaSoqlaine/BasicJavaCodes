package revision;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		
		int count=0;
		
		
		
		
			for(int i=2;i<=n;i++) {
				if(n%i==0) {
				count++;
				break;
				}
			}
			if(count==1 ) {
				System.out.println(n+ "is  prime");
			}
			else {
				System.out.println(n+ "is not prime");
			}
		}
		
	}

//according to the for loop the count will change
