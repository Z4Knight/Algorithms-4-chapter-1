package chapter1_3_15;

import edu.princeton.cs.algs4.Queue;

public class QueueDemo {
	public static void printBackwards(String[] strArray,int k) {
		Queue<String> qs = new Queue<String>();
		for (String s : strArray) {
			qs.enqueue(s);
		}
		
		for (int i = 1; i < strArray.length - k + 1; i++) {
			qs.dequeue();
		}
		
		System.out.println("The k' backwards: " + qs.dequeue());
	}

	public static void main(String[] args) {
		String[] strArray = "abcdefg".split("");
		printBackwards(strArray, 1);
	}
}
