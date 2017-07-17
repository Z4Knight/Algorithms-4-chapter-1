package chapter1_3_33;

import java.util.List;

public class ResizingArrayDeque<Item> {
	private Item[] items = (Item[]) new Object[1];
	private int n;
	
	public ResizingArrayDeque(int sz) {
		// TODO Auto-generated constructor stub
		n = sz;
	}
	
	public boolean isEmpty() {
		return n == 0;
	}
	
	public int size() {
		return n;
	}
	
	private void resize(int max) {
		Item[] temp = (Item[]) new Object[max];
		for (int i = 0; i < n; i++) {
			temp[i] = items[i];
		}
		items = temp;
	}
	
	public void pushLeft(Item item) {
		if (n == items.length) {
			resize(n * 2);
		}
		
	}
	
}
