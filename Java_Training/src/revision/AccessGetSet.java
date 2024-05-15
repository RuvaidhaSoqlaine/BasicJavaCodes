package revision;

import java.util.Scanner;

public class AccessGetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc= new Scanner(System.in);
		
		GetSet per= new GetSet();
//		per.setName(sc.next());
//		per.setAge(sc.nextInt());
//		per.setCountry(sc.next());
		per.setter("Ruvaidha", 23, "zumbabezimbabebe");
		System.out.println(per.getter());

	}

}
