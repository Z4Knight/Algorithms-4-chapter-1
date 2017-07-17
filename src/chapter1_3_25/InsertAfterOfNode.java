package chapter1_3_25;

import chapter1_3_19.Node;

public class InsertAfterOfNode {
	
	public static void insertAfter(Node<Integer> firstNode, Node secondNode) {
		if (!(firstNode == null && secondNode == null)) {
			secondNode.next = firstNode.next;
			firstNode.next = secondNode;
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
		
		Node<Integer> temp = new Node<Integer>();
		
		insertAfter(fourth, temp);
		System.out.println(fourth.next == temp);
		System.out.println(temp.next == fifth);
	}
}
