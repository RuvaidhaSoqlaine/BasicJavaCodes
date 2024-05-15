package resource;

public class Fibonacci2 {
	
	
	
	static int num1=0, num2=1, num3=0;
	
	static void Fibonacci(int count) {
		if(count>0) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			
			System.out.print( " "+num3);
			Fibonacci(count);
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
	}

}