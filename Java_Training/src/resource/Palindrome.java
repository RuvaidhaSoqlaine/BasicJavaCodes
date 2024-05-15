package resource;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number=45354;
		
		int temp;
		
		int sum=0;
		
		temp=number;
		
		while(number>0) {
			int r=number%10;
			
			sum=(sum*10)+r;
			number=number/10;
		}
		if(temp==sum) {
		System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is not palindrome");
		}
	}

}
