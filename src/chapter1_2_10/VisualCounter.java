package chapter1_2_10;

import edu.princeton.cs.algs4.StdDraw;

public class VisualCounter {
	private int count;
	private int val;
	private int N;
	private int max;
	private int x = 0;
	public VisualCounter(int N, int max){
		this.N = N;
		this.max = max;
		StdDraw.setXscale(0,N);
		StdDraw.setYscale(-max,max);
		StdDraw.setPenRadius(0.005);
	}
	
	public void increment(){
		if(count < N && val < max){
			count++;
			val++;
			x++;
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.point(x, val);
		}
	}
	
	public void decrement(){
		if(count < N &&  val > - max){
			count--;
			val--;
			x++;
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.point(x, val);
		}
	}
	
	public int tally(){
		return count;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return count+"";
	}
	
	public static void main(String[] args) {
		VisualCounter vc = new VisualCounter(2000, 1000);
		for(int i = 0; i < 2000; i++){
			if(i/500 == 1){
				vc.increment();
			}else{
				vc.decrement();
			}
			System.out.println(vc.tally());
		}
	}
}
