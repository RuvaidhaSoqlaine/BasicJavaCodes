package javaprog;

public class Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]={33,3,4,5};  
		System.out.println("Printing original array:");  
		for(int i:arr)  
		System.out.println(i);  
		  
		System.out.println("Printing clone of the array:");  
		int carr[]=arr.clone();  
		for(int i:carr)  
		System.out.println(i);  
		  
		System.out.println("Are both equal?");  
		System.out.println(arr==carr);  
	int a=5;
	int b=5;
		if(a==b) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		  
		
	}

}
