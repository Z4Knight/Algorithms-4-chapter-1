package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_19 {
	public static long F(int n){
		if(n == 0) return 0;
		if(n == 1) return 1;
		return F(n-1) + F(n-2);
	}
	public static void main(String[] args) {
		long[] a = new long[100];
		f(a);
	}
	
	public static void f(long [] a){
		a[0] = 0;
		a[1] = 1;
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i-1] + a[i-2];
			System.out.println(i+" "+a[i]);
		}
	}
}
