package chapter1_1;

public class Exercise_1_13 {
	public static void reverseArray(int [][] a){
		int [][] b = new int[a[0].length][a.length];
		for(int i = 0; i < a.length ; i++)
			for(int j = 0; j < a[0].length; j++){
				b[j][i] = a[i][j];
			}
		printArray(b);
	}
	
	public static void printArray(int [][] array){
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[0].length; j++){
				if(j != array[0].length-1){
					System.out.print(array[i][j]+",");
				}else{
					System.out.print(array[i][j]);
				}
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int [][] a = new int[2][3];
		for(int i = 0; i < 2; i++)
			for(int j = 0; j < 3; j++){
				a[i][j] = i+j;
			}
		printArray(a);
		System.out.println("After reverse: ");
		reverseArray(a);
	}
}
