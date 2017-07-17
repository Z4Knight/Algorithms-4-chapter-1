package chapter1_3_21;

public class Node<Item> {
	public Item item;
	public Node<Item> next;
	
	public Node(Item item) {
		this.item = item;
	}
}
