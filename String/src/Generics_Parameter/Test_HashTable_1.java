package Generics_Parameter;

import java.util.Hashtable;
import java.util.Map;

public class Test_HashTable_1 {
public static void main(String[] args) {
	Hashtable <Integer,String> map = new Hashtable();
	//in hash table no allowed null in key and value
	//it will show null pointer exception
	map.put(null, "Radha");
	map.put(null, "Ayushi");
	map.put(null, "Anita");
	map.put(20, "Megha");
	map.put(50, null);
	
	int size = map.size();
	// advanced for loop
	for(Map.Entry<Integer, String> e:map.entrySet()) {
		System.out.println("Key "+ e.getKey()+ "Value "+ e.getValue());
	}
	
	
}



}

