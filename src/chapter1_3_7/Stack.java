package chapter1_3_7;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {

	private Node<Item> first;
	private int  n;
	private static class Node<Item> {
		Node<Item> next;
		Item item;
	}
	
	public boolean isEmpty() {
		return first == null;
		//return n == 0; р╡©ирт
	}
	
	public int size() {
		return n;
	}
	
	public void push(Item item) {
		Node<Item> oldFirst = first;
		first = new Node<Item>();
		first.item = item;
		first.next = oldFirst;
		n++;
	}
	
	public Item pop() {
		Item item = first.item;
		first = first.next;
		n--;
		return item; 
	}
	
	public Item peek() {
		return first.item;
	}
	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		
	}
}
