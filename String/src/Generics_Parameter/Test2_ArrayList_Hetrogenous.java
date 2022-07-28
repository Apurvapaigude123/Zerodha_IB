package Generics_Parameter;

import java.util.ArrayList;

public class Test2_ArrayList_Hetrogenous {
	
	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<Integer>(); //heterogeneous accept only perticular datatype
		list.add(564789);
		list.add(456321);
		list.add(2135);
		list.add(3456);
		
		int size = list.size();
		
		System.out.println("size:"+ size);
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
			System.out.println("=============================");
			list.remove(3);
			int size1 = list.size();
			System.out.println("size:"+ size1);
			
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
		}
	}


