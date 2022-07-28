package Generics_Parameter;

public class TestUDDatatype <T> {
	int a;
	T b;
	public static void main(String[] args) {
		TestUDDatatype t = new TestUDDatatype();
		t.a=60;
		t.b=60;
		System.out.println(t.b);
		t.b="Velocity";
		System.out.println(t.b);
	
	
	TestUDDatatype z = new TestUDDatatype();
   z.b=980;
   System.out.println(z.b);
}
}