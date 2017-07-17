package chapter1_1;


public class Exercise_1_5 {
	public static String isDouble(double x,double y){
		if((x > 0 && x < 1) &&(y > 0 && y < 1)){
			return "true";
		}
		return "false";
	}
	
	public static void main(String[] args) {
		double d1 = 0.11;
		double d2 = 1.11;
		double d3 = -0.11;
		double d4 = 0.91;
	
		System.out.println(isDouble(d1, d2));
		System.out.println(isDouble(d1, d3));
		System.out.println(isDouble(d1, d4));
		System.out.println("-----------");
		
	
	}
}
