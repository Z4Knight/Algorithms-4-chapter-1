package chapter1_3_10;

import edu.princeton.cs.algs4.Stack;

public class InfixToPostfix {
	
	static void infixToPostFix(String[] strArray) {
		Stack<String> stack = new Stack<String>();
		for (String s : strArray) {
			if ("(".equals(s)) {
				System.out.print("");
			} else if ("+".equals(s) || "-".equals(s) || "*".equals(s)
					 || "/".equals(s)) {
				stack.push(s);
			} else if (")".equals(s)) {
				System.out.print(stack.pop() + " ");
			} else{
				System.out.print(s + " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] strArray = "( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )".split(" ");
		infixToPostFix(strArray);
		
	}

}
