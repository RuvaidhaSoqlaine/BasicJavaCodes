package revision;

import java.util.Scanner;

public class Traffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String colour;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the colour: ");
		colour=sc.next();
		
		switch(colour) {
		
		case"Red":
			System.out.println("Stop");
			break;
		case"Green":
			System.out.println("Go");
			break;
		case"Orange":
			System.out.println("Ready");
		}
		
		
	}

}
