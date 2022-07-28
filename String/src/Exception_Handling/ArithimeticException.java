package Exception_Handling;

public class ArithimeticException {
	
	public static void main(String[] args) {
		int a=20;
		int b=0;
		int c=0;
		int [] d = {54,87,65,45};
		System.out.println("start");
		try {
			c=a/b; //risky code
			System.out.println(d[8]);
		}
		catch(ArithmeticException e) {
			//alternative code 
			System.out.println("Alternative code");
		b=2;
		c=a/b;

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index out of bound");

		}
		System.out.println(c);

		System.out.println(d[2]);
		
	}
	

}
