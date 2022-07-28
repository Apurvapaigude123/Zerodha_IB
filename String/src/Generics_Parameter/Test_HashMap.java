package Generics_Parameter;

import java.util.HashMap;
import java.util.Map;

public class Test_HashMap {
	
public static void main(String[] args) {
	
	HashMap <Integer,String>  map = new HashMap();
	//in hashmap key is unique and value is not unique 
	//that means key only one time null and value can be any no of time null eg:1 
	map.put(12, "sql");
	map.put(34, null);
	map.put(70, "api");
	map.put(null, "unix");
	map.put(60, "jira");
	map.put(50, null);
	map.put(40, null);
	
	 int size = map.size();
	 System.out.println("size:"+ size);
	 
	 //advance for loop
	 for(Map.Entry<Integer, String> e: map.entrySet()) {
		 System.out.println("Key " + e.getKey() + "Value "+ e.getValue());
	 }

System.out.println("--------------------------------");
map.put(100, "apurva");
for(Map.Entry<Integer, String> e: map.entrySet()) {
	 System.out.println("Key " + e.getKey() + "Value "+ e.getValue());
}
	
}
}
