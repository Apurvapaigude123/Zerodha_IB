package Generics_Parameter;

import java.util.HashMap;
import java.util.Map;

public class Test_HAshMap2 {
	
public static void main(String[] args) {
	
	HashMap <Integer,String> map = new HashMap();
	// if we take null values more than one count it will skip the key and values and only take one value in console
	map.put(null, "Radha");
	map.put(null, "Ayushi");
	map.put(null, "Anita");
	map.put(20, "Megha");
	map.put(50, "Apurva");
	
	int size = map.size();
	// advanced for loop
	for(Map.Entry<Integer, String> e:map.entrySet()) {
		System.out.println("Key "+ e.getKey()+ "Value "+ e.getValue());
	}
	
	
}

}
