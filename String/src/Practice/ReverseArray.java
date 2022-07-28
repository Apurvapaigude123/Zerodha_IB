package Practice;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		int a[]= {10,30,20,60,40,50};
		Arrays.sort(a);
		System.out.println("arrays in Order");
		for(int i=0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
		System.out.println("arrays in Reverse Order");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	
	}
	
	}

