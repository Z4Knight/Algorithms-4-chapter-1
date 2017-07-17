package chapter1_3_33;

public class Deque<Item> {
	private int n;
	private DoubleLinkedList first;
	private DoubleLinkedList last;
	
	private class DoubleLinkedList {
		private Item item;
		private DoubleLinkedList forward;
		private DoubleLinkedList next;
	}
	
	public Deque() {
		n = 0;
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return n == 0;
	}
	
	public int size() {
		return n;
	}
	
	public void pushLeft(Item item) {
		DoubleLinkedList oldfirst = first;
		first = new DoubleLinkedList();
		first.item = item;
		first.next = oldfirst;
		first.forward = null;
		if (isEmpty()) {
			last = first;
		}
		oldfirst.forward = first;
		n++;
	}
	
	public void pushRight(Item item) {
		DoubleLinkedList oldlast = last;
		last = new DoubleLinkedList();
		last.item = item;
		last.forward = oldlast;
		last.next = null;
		if (isEmpty()) {
			first = last;
		}
		oldlast.next = last;
		n++;
	}
	
	public Item popLeft() {
		Item item = first.item;
		first = first.next;
		if (isEmpty()) {
			first = null;
		}
		n--;
		return item;
	}
	
	public Item popRight() {
		Item item = last.item;
		last = last.forward;
		if (isEmpty()) {
			last = null;
		}
		n--;
		return item;
	}
}
