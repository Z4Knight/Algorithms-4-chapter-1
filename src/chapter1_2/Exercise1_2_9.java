package chapter1_2;

class BinarySearch{
	public static int rank(int key, int[] a,Counter counter){
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi){
			int mid = lo + (hi - lo) / 2;
			if(key < mid) hi = mid - 1;
			else if(key > mid) lo = mid + 1;
			else return mid;
			counter.increment();
		}
		return -1;
	}
}

class Counter{
	private final String name;
	private int count;
	public Counter(String id){
		name = id;
	}
	
	public void increment(){
		count++;
	}
	
	public int tally(){
		return count;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return count + " " + name;
	}
}

public class Exercise1_2_9 {
	public static void main(String[] args) {
		int[] array	= new int[]{
			1 ,2 ,3 ,4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,
			17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 32
		};
		
		Counter binaryCounter = new Counter("binaryCounter");
		if(BinarySearch.rank(14, array, binaryCounter) != -1){
			System.out.println("times is " + binaryCounter.tally());
		};
		
	}
}
