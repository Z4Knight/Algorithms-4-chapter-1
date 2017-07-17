package chapter1_3_14;

public class ResizingArrayQueueOfStrings<Item> {
	private Item[] a = (Item[]) new Object[1];
	private int head = 0;
	private int tail = 0;
	private int n = 0;
	
	public boolean isEmpty() {
		return n == 0;
	}
	
	public int size() {
		return n;
	}
	
	private void resize(int max) {
		Item[] temp = (Item[]) new Object[max];
		for (int i = 0; i < n; i++) {
			temp[i] = a[(head + i) % a.length];
		}
		a = temp;
		head = 0;
		tail = n;
	}
	
	public void enqueue(Item item) {
		if (n == a.length) {
			resize(2 * a.length);
		}
		a[tail++] = item;
		if (tail == a.length) {
			tail = 0;
		}
		n++;
	}
	
	public Item dequeue() {
		Item item = a[head];
		a[head] = null;
		head++;
		n--;
		if (head == a.length) {
			head = 0;
		}
		if (n > 0 && n == a.length / 4) {
			resize(a.length / 2);
		}
		return item;
	}
	public static void main(String[] args) {
		ResizingArrayQueueOfStrings<String> ras = new ResizingArrayQueueOfStrings<String>();
		String[] strArray = "abcdefg".split("");
		for (String s : strArray) {
			ras.enqueue(s);
		}
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.print(ras.dequeue() + " ");
		}
		
	}
}
