package javaprog;

import java.util.Scanner;

public class JagArrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		String arr[][]= new String[3][];
		arr[0] = new String[1];
		arr[1] = new String[2];
		arr[2] = new String[3];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]= sc.next();
			}
			}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
            System.out.println();//new line  

		}
		
		      
	}

}
            