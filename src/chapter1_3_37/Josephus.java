package chapter1_3_37;

import edu.princeton.cs.algs4.Queue;

public class Josephus {
	static void kill(int n, int m) {
		Queue<Integer> person = new Queue<Integer>();
		Queue<Integer> order = new Queue<Integer>();
		
		for (int i = 0; i < n; i++) {
			person.enqueue(i);
		}
		int flag = 1;
		while (!person.isEmpty()) {
			if (flag != m) {
				person.enqueue(person.dequeue());
				flag++;	
			} else if (flag == m) {
				order.enqueue(person.dequeue());
				flag = 1;
			}
			
		}
		System.out.println(order);
	}
	
	public static void main(String[] args) {
		kill(7,2);
		
	}
}
