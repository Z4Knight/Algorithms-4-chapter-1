package chapter1_3_28;

import chapter1_3_21.Node;

public class RecursionOfNode {
	
	public static int max(Node<Integer> node, int max) {
		if (node == null) {
			return 0;
		}
		
		int maxVal = max;
		if (node.next == null) {
			maxVal = maxVal > node.item ? maxVal : node.item;
			return maxVal;
		} else if (node.next != null) {
			maxVal = maxVal > node.item ? maxVal : node.item;
			return max(node.next, maxVal);
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
		
		System.out.println(max(first,first.item));
	}
}
