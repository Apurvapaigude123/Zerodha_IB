package Practice;

public class CalculateSumOfString {
	
	public static void main(String[] args) {
		String s= "65312";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char b= s.charAt(i);
			if(Character.isDigit(b)) {
				int c= Integer.parseInt(s.valueOf(b));
				sum=sum+c;
			}
		}
		System.out.println(sum);
	}
} 