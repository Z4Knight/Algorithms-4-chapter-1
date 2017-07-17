package chapter1_1;

public class Exercise_1_15 {
	public static int[] histogram(int []a,int m){
		int[] b = new int[m];
		for (int i = 0; i < b.length; i++) {
			b[i] = 0;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) 
					b[i] += 1;
			}
		}
		return b;
		
	}
	
	public static void main(String[] args) {
		int[] a = {1,1,2,3,3,1,1,1};
		int[] b = new int[4];
		b = histogram(a, 4);
		printArray(b);
	}
	
	public static void printArray(int[] array){
		for(int i = 0; i <= array.length; i++){	
			if (i == 0) {
				System.out.print("["+array[i]);
			}else if (i == array.length) {
				System.out.println("]");
			}else {
				System.out.print(","+array[i]);
			}
		}
	}
}
