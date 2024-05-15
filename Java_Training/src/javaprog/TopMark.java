package javaprog;

public class TopMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] marks= {108,96,100,200,39,250};
		int top=marks[0];
		for(int mar : marks) {
			if(mar>top) {
				top=mar;
				System.out.println(top);
			}
		}
	}

}
