package resource;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=153;
		int temp=n;
		int sum=0;
		int r;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum + r*r*r;
		}
		
		if(sum==temp) {
			System.out.println("It is an armstrong number ");
		}
		else {
			System.out.println("It is not an armstrong number ");
		}
	}

}
