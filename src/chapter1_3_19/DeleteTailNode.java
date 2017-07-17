package chapter1_3_19;

public class DeleteTailNode {
	
	public static void main(String[] args) {
		Node<Integer> first = new Node<Integer>();
		Node<Integer> second = new Node<Integer>();
		Node<Integer> third = new Node<Integer>();
		first.next = second;
		second.next = third;
		
		Node<Integer> head = new Node<Integer>();
		head.next = first;
		
		while (true) {
			head = head.next;
			first = first.next;
			if (first.next == null) {
				head.next = null;
				break;
			}
		}
		System.out.println(second.next == null);
	}
}
