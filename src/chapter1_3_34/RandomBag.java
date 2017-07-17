package chapter1_3_34;

import java.util.Iterator;
import java.util.Random;

import edu.princeton.cs.algs4.StdRandom;

public class RandomBag<Item> implements Iterable<Item> {
	private int n;
	private Node first;
	
	private class Node {
		Item item;
		Node next;
	}
	
	public RandomBag() {
		first = null;
	}
	
	public boolean isEmpty() {
		return n == 0;
	}
	
	public int size() {
		return n;
	}
	
	public void add(Item item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		n++;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder bulider = new StringBuilder();
		for (Item item : this) {
			bulider.append(item + " ");
		}
		return bulider.toString();
	}
	
	public Iterator<Item> iterator() {
		return new ListIterator<Item>();
	}
	
	private class ListIterator<Item> implements Iterator<Item> {

		private int m = n, i = 0;
		private Node current = first;
		private Item[] items = (Item[]) new Object[m];
		private Random random = new Random(47);
		
		public ListIterator() {
			for (Node x = current; x != null; x = x.next) {
				items[random.nextInt(m)] = (Item) x.item;
			}
		}
			
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current != null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			if (i < m) {
				return items[i++];
			}
			return null;
		}
		
	}
	public static void main(String[] args) {
		RandomBag<Integer> rgi = new RandomBag<Integer>();
		for (int i = 0; i < 15; i++) {
			rgi.add(i);
		}
		
		System.out.println(rgi);
	}
}
