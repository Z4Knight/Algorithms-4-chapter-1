package chapter1_3_42;

import java.util.Iterator;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;


public class CopyOfStack<Item> implements Iterable<Item> {
	private int n;
	private Node first;
	
	public CopyOfStack() {
		first = null;
		n = 0;
	}
	
	public CopyOfStack(CopyOfStack<Item> s) {
		n = s.size();
		Iterator<Item> it = s.iterator();
		Stack<Item> t = new Stack<Item>();
		while (it.hasNext()) {
			t.push(it.next());
		}
		while (!t.isEmpty()) {
			push(t.pop());
		}
	}
	
	
	
	private class Node {
		Item item;
		Node next;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return n;
	}
	
	public void push(Item item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		if (isEmpty()) {
			n++;
		} else {
			first.next = oldfirst;
			n++;
		}
	}
	
	public Item pop() {
		if (isEmpty()) {
			throw new RuntimeException("no such elements");
		}
		Item item = first.item;
		first = first.next;
		n--;
		return item;
	}
	
	public Item peek() {
		if (isEmpty()) {
			throw new RuntimeException("no sucn elements");
		}
		return first.item;
	}
	
	public Iterator<Item> iterator() {
		return new ListIterator<Item>();
	}
	
	private class ListIterator<Item> implements Iterator<Item> {

		private Node current = first;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current != null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			if (!hasNext()) {
				throw new RuntimeException("no such elements");
			}
			Item item = (Item) current.item;
			current = current.next;
			return item;
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder result = new StringBuilder();
		for (Item item : this) {
			result.append(item + " ");
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		CopyOfStack<Integer> cs = new CopyOfStack<Integer>();
		for(int i = 0; i < 10; i++) {
			cs.push(i);
		}
		System.out.println("cs: " + cs);
		CopyOfStack<Integer> ct = new CopyOfStack<Integer>(cs);
		System.out.println("ct: " + ct);
	}
}
