package revision;

import java.util.Scanner;

public class CmprStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string: ");
		s1=sc.next();
		System.out.println("Enter second string: ");
		s2=sc.next();
		
		if(s1.equals(s2)) {
			System.out.println("Given Strings are Equal");
		}
		else {
			System.out.println("Given Strings are not equal");
		}
	}

}
