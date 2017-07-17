package chapter1_2;

public class Exercise1_2_6 {
	
	public static void isCircular(String s, String t){
		if((s+s).indexOf(t) > 0 && s.length() == t.length()){
			System.out.println("It is circular rotation");
		}else{
			System.out.println("It is not circular rotation");
		}
	}
	
	public static String mystery(String s){
		int N = s.length();
		if(N <= 1) return s;
		String a = s.substring(0,N/2);
		String b = s.substring(N/2, N);
		return mystery(b) + mystery(a);
	}
	
	public static void main(String[] args) {
		String s1 = "ACTGACG";
		String s2 = "TGACGAC";
		isCircular(s2, s1);
		System.out.println("-------------");
		System.out.println(mystery("123456"));
	}
}
