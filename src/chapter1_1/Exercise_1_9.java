package chapter1_1;

public class Exercise_1_9 {
	public static void toBinaryString(int i){
		StringBuffer sb = new StringBuffer();
		for(int n = i; n > 0 ; n /= 2){
			sb.append((n % 2));
		}
		System.out.println(sb.reverse());
	}
	
	public static void main(String[] args) {
		toBinaryString(4);
	}
}
