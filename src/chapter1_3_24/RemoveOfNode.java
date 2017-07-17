package chapter1_3_24;

import chapter1_3_19.Node;

public class RemoveOfNode {
	public static void removeAfter(Node<Integer> node) {
		if (node.next != null) {
			node.next = node.next.next;
		}
	}
	
	public static void main(String[] args) {
		Node<Integer> first = new Node<Integer>();
		Node<Integer> second = new Node<Integer>();
		Node<Integer> third = new Node<Integer>();
		Node<Integer> fourth = new Node<Integer>();
		Node<Integer> fifth = new Node<Integer>();
		Node<Integer> sixth = new Node<Integer>();
		first.next = second;
		second.next = third;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		removeAfter(fourth);
		System.out.println(fourth.next == fifth);
		System.out.println(fourth.next == sixth);
	}
}
