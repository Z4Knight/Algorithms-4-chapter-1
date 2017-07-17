package chapter1_3_32;

import chapter1_3_19.Node;

public class Steque<Item> {
	private Node<Item> first;
	private int n;
	
	public boolean isEmpty() {
		return n == 0;
	}
	
	public int size() {
		return n;
	}
	
	public Steque() {
		n = 0;
		first = null;
	}
	
	public void push(Item item) {
		Node<Item> oldfirst = first;
		first = new Node<Item>();
		first.item = item;
		first.next = oldfirst;
		n++;
	}
	
	public Item pop() {
		Item item = first.item;
		first = first.next;
		n--;
		return item;
	}
	
	public void enqueue(Item item) {
		while(first.next != null) {
			first = first.next;
		}
		Node<Item> oldlast = first;
		first = new Node<Item>();
		first.item = item;
		oldlast.next = first;
		n++;
	}
}
