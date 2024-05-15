package resource;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

           int a=0;
           int b=1;
           int count=10;
           
           System.out.print(a+ " " +b);
           //for loop
           for(int i=2;i<count;i++) {
        	   int n=a+b;
        	   
        	   System.out.print(" " +n);
        	   a=b;
        	   b=n;
           }
          
           
           //while loop
           
 //          int i=2;
//           while(i<count) {
//               int n=a+b;
//        	   
//        	   System.out.print(" " +n);
//        	   a=b;
//        	   b=n;  
//        	   
//        	   i++;
//        	   
//           }

		
	}
	
}

