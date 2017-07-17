package chapter1_3_27;

import chapter1_3_21.Node;

public class MaxOfNode {
	public static int max(Node<Integer> node) {
		int maxVal = 0;
		int temp = node.item;
		if (node != null) {
			while (node.next != null) {
				node = node.next;
				if (temp < node.item) {
					temp = node.item;
				}
			}
			maxVal = temp;
		}
		
		
		return maxVal;
	}
	
	public static void main(String[] args) {
		Node<Integer> first = new Node<Integer>(1);
		Node<Integer> second = new Node<Integer>(2);
		Node<Integer> third = new Node<Integer>(3);
		Node<Integer> fourth = new Node<Integer>(8);
		Node<Integer> fifth = new Node<Integer>(5);
		Node<Integer> sixth = new Node<Integer>(6);
		first.next = second;
		second.next = third;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		System.out.println(max(first));
	}
}
