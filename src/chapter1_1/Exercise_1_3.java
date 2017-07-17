package chapter1_1;

import java.util.Scanner;

public class Exercise_1_3 {
	
	private static Scanner sc;

	public static String isEqual(int[] a){
		if(a[0] == a[1] && a[1] == a[2] ){
			return "equal";
		}
		return "not equal";
	}
	
	public static void main(String[] args) {
		int [] a = new int[3];
		sc = new Scanner(System.in);
		for(int i = 0; i < 3 ; i++)
		 a[i] = sc.nextInt();
		System.out.println(isEqual(a));
	}

}
