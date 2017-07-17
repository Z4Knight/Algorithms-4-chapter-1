package chapter1_3_21;

import chapter1_3_21.Node;

public class FindKeyOfNode {

	public static boolean find(Node<String> node, String key) {
		boolean flag = false;
		while (node.next != null) {
			if (key.equals(node.item)) {
				flag = true;
			}
			node = node.next;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		Node<String> n1 = new Node<String>("n1");
		Node<String> n2 = new Node<String>("n2");
		Node<String> n3 = new Node<String>("n3");
		Node<String> n4 = new Node<String>("n4");
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		System.out.println(find(n1, "n3"));
		System.out.println(find(n1, "n"));
		
	}
}
