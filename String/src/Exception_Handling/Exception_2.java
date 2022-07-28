package Exception_Handling;

public class Exception_2 {
	public static void main(String[] args) {
		int a = 20;
		int b = 0;
		int c = 0;
		int[] d = { 30, 50, 98, 56 };
		System.out.println("Start");
		try {
			c = a / b;// risky code
			System.out.println(c);
			System.out.println(d[4]);// array out of bound
		} catch (ArithmeticException e) {
			// alternative code
			b = 4;
			c = a / b;
			System.out.println(c);
			System.out.println("Alternative code");
			System.out.println("catch block executed");

		} finally {
			System.out.println("Execution of finally block");
		}
		System.out.println(c);
		System.out.println("End"); // normal flow
	}

}
 //Exception is not generated ----------->try-----finally--------normal flow
// Exception generated but not handled----------->try------finally
//Exception generated and handled--------------->try---->catch----->finally-------normal flow