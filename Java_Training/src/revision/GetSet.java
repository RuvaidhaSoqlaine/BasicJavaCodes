package revision;

import java.util.Scanner;

public class GetSet {
	
	Scanner sc= new Scanner(System.in);
	private String name;
	private int age;
	private String country;
	
	public String getter() {
		return ("Name :" + name + "Age :" + age + "Country :" + country);
	}
	
	public void setter(String name, int age, String country) {
		this.name=name;
		this.age=age;
		this.country=country;
	}

//	public void setName(String name) {
//		//this.name=name;
//		name=sc.next();
//	}
//	
//	public void setAge(int age) {
//		//this.age=age;
//		age=sc.nextInt();
//	}
//	
//	public void setCountry(String country) {
//		this.country=country;
//	}

}
