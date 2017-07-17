package chapter1_1;

public class Exercise_1_30 {
	public static void main(String[] args) {
		int n = 5;
		generateArray(n);
	}

	private static void generateArray(int n) {
		// TODO Auto-generated method stub
		boolean[][] array = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++){
				if(gcd(i,j) == 1)
					array[i][j] = true;
				else
					array[i][j] = false;
			}
		}
		printBooleanArray(array);
	}

	private static int gcd(int i, int j) {
		// TODO Auto-generated method stub
		if(i==0 || j==0){
			return 1;
		}
		if(i % j == 0){
			return j;
		}
		else{
			return gcd(j,i%j);
		}
	}
	
	public static void printBooleanArray(boolean[][] arr){
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr.length; j++){
				if(arr[i][j]){
					System.out.println("行号："+i+" 列号："+j+" *");
				}else{
					System.out.println("行号："+i+" 列号："+j+" _");
				}
			}
	}
	
}
