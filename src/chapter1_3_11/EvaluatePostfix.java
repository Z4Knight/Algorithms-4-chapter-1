package chapter1_3_11;

import edu.princeton.cs.algs4.Stack;

public class EvaluatePostfix {
	static void evaluatePostfix(String[] strArray) {
		Stack<Double> stack = new Stack<Double>();
		for (String s : strArray) {
			if ("+".equals(s)) {
				double v = stack.pop();
				v += stack.pop();
				stack.push(v);
			} else if ("-".equals(s)) {
				double v = stack.pop();
				v = stack.pop() - v;
				stack.push(v);
			} else if ("*".equals(s)) {
				double v = stack.pop();
				v *= stack.pop();
				stack.push(v);
			} else if ("/".equals(s)) {
				double v = stack.pop();
				v = stack.pop() / v;
				stack.push(v);
			} else {
				stack.push(Double.parseDouble(s));
			}
		}
		System.out.println(stack.pop());
	}
	public static void main(String[] args) {
		String[] strArray = "1 2 + 3 4 - 5 6 - * * ".split(" ");
		evaluatePostfix(strArray);
	}
}
