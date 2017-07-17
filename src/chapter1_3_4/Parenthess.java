package chapter1_3_4;

import java.util.Scanner;

import edu.princeton.cs.algs4.Stack;

public class Parenthess {
	public static void main(String[] args) {
		Stack<String> ops = new Stack<String>();
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		String[] checkStringArray = sc.nextLine().split(" ");
		for (int i = 0; i < checkStringArray.length; i++) {
			String s = checkStringArray[i];
			if ("(".equals(s)) {
				ops.push(s);
			} else if ("[".equals(s)) {
				ops.push(s);
			} else if ("{".equals(s)) {
				ops.push(s);
			} else if(!ops.isEmpty()) {
			if (")".equals(s)) {
				if ("(".equals(ops.pop())) {
						flag = true;
					} else {
						flag = false;
					}
				} else if ("]".equals(s)) {
					if ("[".equals(ops.pop())) {
						flag = true;
					} else {
						flag = false;
					}
				} else if ("}".equals(s)) {
					if ("{".equals(ops.pop())) {
						flag = true;
					} else {
						flag = false;
					}
				}
			}
		}
		System.out.println("Parenthess is match: " + flag);
		sc.close();
	}

}
