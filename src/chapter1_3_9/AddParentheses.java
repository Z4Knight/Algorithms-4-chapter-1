package chapter1_3_9;

import edu.princeton.cs.algs4.Stack;

public class AddParentheses {
	static void addLeftParenthess(String[] arrayStr) {
		Stack<String> ops = new Stack<String>();
		Stack<String> vals = new Stack<String>();
		for (String s: arrayStr){
			if ("+".equals(s) || "-".equals(s) || "*".equals(s)
					|| "/".equals(s) || "sqrt".equals(s)) {
				ops.push(s);
			}
			else if (")".equals(s)) {
				String op = ops.pop();
				String val = vals.pop();
				if ("+".equals(op) || "-".equals(op) || "*".equals(op)
						|| "/".equals(op)) {
					val = String.format("( %s %s %s )", vals.pop(), op, val);
				} else if ("sqrt".equals(op)) {
					val = String.format("( %s %s )", op, val);
				}
				vals.push(val);
			}
			else {
				vals.push(s);
			}
		}
		System.out.println(vals.pop());
		
	}
	public static void main(String[] args) {
		String[] arrayStr1 =  "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )".split(" ");
		String[] arrayStr2 =  "sqrt 1 + 2 ) )".split(" ");
		addLeftParenthess(arrayStr1);
		addLeftParenthess(arrayStr2);
	}
}
