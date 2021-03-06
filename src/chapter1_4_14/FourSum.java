package chapter1_4_14;

import java.util.Arrays;

import edu.princeton.cs.algs4.BinarySearch;

public class FourSum {
	public static int count(int[] a) {
		Arrays.sort(a);
		int n = a.length;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (BinarySearch.rank(-a[i]-a[j]-a[k], a) > k) {
						cnt++;
					}
				}
			}
		}
		return cnt;
	}
}
