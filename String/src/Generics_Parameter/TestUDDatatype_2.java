package Generics_Parameter;

public class TestUDDatatype_2 <T,L> {
	int a;
	T b;
	//return type generic T //L = Argument
	
	T Demo(L d){
		System.out.println(d);
		
		return b;
	}
public static void main(String[] args) {
	TestUDDatatype_2 v = new TestUDDatatype_2();
	
	v.Demo("Appurva");
	v.Demo(12345);
	v.Demo('#');
	v.Demo(65.12f);
	
}
}
