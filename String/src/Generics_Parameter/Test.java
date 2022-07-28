package Generics_Parameter;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
	
	ArrayList list = new ArrayList(); //homogenous alltypes of datatypes acceptable
	list.add(123456);
	list.add('@');
	list.add("Velocity");
	list.add(28.63f);
	
	int Size = list.size();
	
	System.out.println("Size :"+ Size);
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	System.out.println("--------------------------------");
	
  list.remove(1);
  
  int Size1 = list.size();
	System.out.println("Size :"+ Size1);

  for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
  
}
	
}
}