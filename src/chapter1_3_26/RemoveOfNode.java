package chapter1_3_26;

import chapter1_3_21.Node;

public class RemoveOfNode {
	public static void remove(Node<String> node, String key) {
		if (key.equals(node.item)) {
			node = node.next;
			
		}
		
		while (node.next != null) {
			if (key.equals(node.next.item)) {
				node.next = node.next.next;
			}
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		Node<String> n1 = new Node<String>("n3");
		Node<String> n2 = new Node<String>("n2");
		Node<String> n3 = new Node<String>("n3");
		Node<String> n4 = new Node<String>("n4");
		Node<String> n5 = new Node<String>("n3");
		Node<String> n6 = new Node<String>("n6");
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		remove(n1, "n3");
		System.out.println(n2.next == n3);
		System.out.println(n1.next == n2);
		System.out.println(n4.next == n5);
	}
}
