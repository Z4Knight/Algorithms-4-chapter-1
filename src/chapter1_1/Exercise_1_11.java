package chapter1_1;

public class Exercise_1_11 {
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
	
	public static void main(String[] args) {
		boolean [][] arr = new boolean[3][3];
		for(int i = 0 ; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(i == j){
					arr[i][j] = true;
				}else{
					arr[i][j] = false;
				}
			}
		}
		printBooleanArray(arr);
	}
}
