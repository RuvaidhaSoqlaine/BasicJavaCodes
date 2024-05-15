package javaprog;

import java.util.Scanner;

public class Employee {
	
	String name;
	int id;
	String grade;
	int pay;
	String location;
	public void GetData() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the name of an Employee: ");
		name=sc.next();
		
		System.out.println("Enter the id of an Employee");
        id=sc.nextInt();
		
        System.out.println("Enter the grade of an Employee");
		grade=sc.next();
		
		System.out.println("Enter the pay of an Employee");
		pay= sc.nextInt();
		
		System.out.println("Enter the location of an Employee");
		location= sc.next();

	}
	public void PrintData() {

		System.out.println("The name of an Employee: "  +name);
		System.out.println("The id of an Employee: "  +id);
		System.out.println("The grade of an Employee: "  +grade);
		System.out.println("The pay of an Employee: "  +pay);
		System.out.println("The location of an Employee: "  +location);

	}


}
