package chapter1_3_12;

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
		return new ListIterator<Item>(first);
	}
	
	private class ListIterator<Item> implements Iterator<Item> {

		private Node<Item> current;
		public  ListIterator(Node<Item> first) {
			// TODO Auto-generated constructor stub
			current = first;
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current != null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			Item item = current.item;
			current = current.next;
			return item;
		}
		
	}
	
	public static Stack<String> copy(Stack<String> ss) {
		Stack<String> result = new Stack<String>();
		Stack<String> temp = new Stack<String>();
		Iterator<String> is = ss.iterator();
		while (is.hasNext()) {
			temp.push(is.next());
		}
	
		while (!temp.isEmpty()) {
			result.push(temp.pop());
		}

		return result;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(Item i : this) {
			sb.append(i + " ");
		}
		sb.append("]");
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>();
		Stack<String> s2 = new Stack<String>();
		for (String s : "123456789".split("")) {
			s1.push(s);
		}
		System.out.println("s1: " + s1);
		s2 = copy(s1);
		System.out.println("s1's copy: " + s2);
	}
}
