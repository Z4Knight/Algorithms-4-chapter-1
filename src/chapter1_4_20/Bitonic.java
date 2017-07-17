package chapter1_4_20;

import java.util.Arrays;

import edu.princeton.cs.algs4.*;



public class Bitonic {
	 public static int[] bitonic(int N) {
	        int mid = StdRandom.uniform(N);
	        int[] a = new int[N];
	        for (int i = 1; i < mid; i++) {
	            a[i] = a[i-1] + 1 + StdRandom.uniform(9);
	        }

	        if (mid > 0) a[mid] = a[mid-1] + StdRandom.uniform(10) - 5;

	        for (int i = mid + 1; i < N; i++) {
	            a[i] = a[i-1] - 1 - StdRandom.uniform(9);
	        }

	        for (int i = 0; i < N; i++) {
	            StdOut.print(a[i] + ", ");
	            if (i == a.length - 1) {
					System.out.println(a[i]);
				}
	        }
	        System.out.println();
	        return a;
	 }
	
	public static int find(int[] a, int key) {
		Arrays.sort(a);
		return Arrays.binarySearch(a, key);
	}
	
	public static void main(String[] args) {
		int[] a = bitonic(15);
		System.out.println(find(a, 2));
	}
}
