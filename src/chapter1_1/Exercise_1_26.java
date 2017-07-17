package chapter1_1;

public class Exercise_1_26 {
	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		int c = 8;
		sort(a,b,c);
	}

	private static void sort(int a, int b, int c) {
		int t = 0;
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}else if(a > c){
			t = a;
			a = c;
			c = t;
		}else if(b > c){
			t = b;
			b = c;
			c = t;
		}
		System.out.println("ÉıĞò£º "+a+" "+b+" "+c);
	}
}
