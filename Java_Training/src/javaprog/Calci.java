package javaprog;

public class Calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a= 10;
		double d= 5.4;
		short s= 100;
		long l= 123456;
		double add,subtract,multiply,divide,modulus,postin,prein,postdec,predec;
		add= s+a; 
		System.out.println("The addition of two numbers:" +add);
		subtract= l-a; 
		System.out.println("The subtraction of two numbers:" +subtract);
		multiply= a*d;
		System.out.println("The multiplication of two numbers:" +multiply);
		divide= l/s;
		System.out.println("The division of two numbers:" +divide);
		modulus= l%d;
		System.out.println("The modulus of two numbers:" +modulus);
		postin= a++;
		System.out.println("The postin of two numbers:" +postin);
		prein= ++d;
		System.out.println("The prein of two numbers:" +prein);
		postdec= s--;
		System.out.println("The postdec of two numbers:" +postdec);
		predec= --l;
		System.out.println("The predec of two numbers:" +predec);

		
		
	  
		
		
	}

}
