package resource;

public class StrPerform {

	
	public static void main(String[] args) {
		
		
		long startTime=System.currentTimeMillis();
		StringBuffer buffer=new StringBuffer("Java");
		for(int i=0;i<10000;i++) {
			buffer.append("TPoint");
		}
		System.out.println("Time taken for buffer is" +(System.currentTimeMillis()-startTime)+ "ms");
		
		startTime=System.currentTimeMillis();
		StringBuilder builder=new StringBuilder("Java");
		for(int i=0;i<10000;i++) {
			buffer.append("TPoint");
		}
		System.out.println("Time taken for builder is" +(System.currentTimeMillis()-startTime)+ "ms");
		
		
	}
}
