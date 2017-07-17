package chapter1_1;

public class Exercise_1_16 {
	public static String exR1(int n){
		// String s = exR1(n-3) + n + exR1(n-2) + n;
		if(n <= 0) return "";
		 return exR1(n-3) + n + exR1(n-2) + n;
		// return s;
	}
	
	public static void main(String[] args) {
		System.out.println(exR1(6));
		System.out.println(0.5 % 2);
	}
}
