package Generics_Parameter;

import java.util.HashSet;

public class Test_Hashset {
	public static void main(String[] args) {
		HashSet<Character> set = new HashSet();
		//insertion order not maintain in hashset
	set.add('*');
	set.add('%');
	set.add('$');
	set.add('#');
	set.add('@');
	
	int size = set.size();
	System.out.println("size:"+ size);
	
	//advanced for loop
	for(char r:set) {
		System.out.println(r);
	}
		
	}

}
