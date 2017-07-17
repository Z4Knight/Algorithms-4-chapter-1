package chapter1_1;

public class Exercise_1_20 {
	public static double factorialln(long n){
		if (n > 1) {
			return Math.log10(n)*factorialln(n-1);
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		double i = factorialln(5);
		System.out.println(i);
	}
}
