package chapter1_3_20;

import chapter1_3_19.Node;

public class NodeDemo {
	public static void delete(Node<Integer> node,int k) {
		Node<Integer> temp = new Node<Integer>();
		temp = node;
		int number = 1;
		while(temp.next != null) {
			temp = temp.next;
			++number;
		}
		if (k > number) {
			System.out.println("no elements");
		} else if (k == 1) {
			Node<Integer> oldNode = node;
			node = node.next;
			oldNode.next = null;
		} else  {
			while (k - 2 > 0) {
				node = node.next;
				k--;
			}
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
		
		delete(first, 1);
		System.out.println(fifth.next == sixth);
	}
}
