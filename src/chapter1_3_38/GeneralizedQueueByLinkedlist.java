package chapter1_3_38;

public class GeneralizedQueueByLinkedlist<Item> {
	private int n;
	private Node first;
	private Node last;
	
	public GeneralizedQueueByLinkedlist() {
		first = null;
		last = null;
		n = 0;
	}
	
	private class Node {
		Item item;
		Node next;
	}
	
	public boolean isEmpty() {
		return n == 0;
	}
	
	public void insert(Item item) {
		Node oldlast = last;
		last = new Node();
		last.item = item;
		if (isEmpty()) {
			first = last;
		} else {
			oldlast.next = last;
		}
		
		n++;
	}
	
	public Item delete(int k) {
		int i = 0;
		Item item = null;
		if (isEmpty()) {
			throw new RuntimeException("no such elements");
		}
		
		if (k == 1) {
			item = first.item;
			first = first.next;
			n--;
		} else if(k > 1) {
			for (Node node = first; node != null; node= node.next) {
				i++;
				if (i == k-1) {
					item = node.next.item;
					node.next = node.next.next;
					n--;
				}
			}
		}
		
		return item;
	}
	
	public static void main(String[] args) {
		GeneralizedQueueByLinkedlist<Integer> ints = new GeneralizedQueueByLinkedlist<Integer>();
		for (int i = 0; i < 10; i++) {
			ints.insert(i);
		}
		System.out.println(ints.delete(4));
	}
}
