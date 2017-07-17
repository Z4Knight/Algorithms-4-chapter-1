package chapter1_2_13And14;

import java.util.ArrayList;
import java.util.List;

import edu.princeton.cs.algs4.Date;

public class Transaction {
	private final String who;
	
	private final Date when;
	
	private final double amount;
	
	public Transaction(String who,Date when,double amount){
		this.who = who;
		this.when = when;
		this.amount = amount;
	}
	
	public String who(){
		return who;
	}
	
	public Date when(){
		return when;
	}
	
	public double amount(){
		return amount;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return who() + "/" + when()
				+ "/" + amount();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) return true;
		if(obj == null) return false;
		if(this.getClass() != obj.getClass()) return false;
		Transaction that = (Transaction) obj;
		if(this.who != that.who) return false;
		if(this.when.day() != that.when.day()) return false;
		if(this.when.month() != that.when.month()) return false;
		if(this.when.year() != that.when.year()) return false;
		if(this.amount != that.amount) return false;
		return true;
		
	}
	public static void ShowTransaction(List<Transaction> tlist){
		for (int i = 0; i < tlist.size(); i++) {
			System.out.println(tlist.get(i));
		}
	}
	
	public static void main(String[] args) {
		Transaction t1 = new Transaction("kk", new Date(2, 9, 2017), 2000);
		Transaction t2 = new Transaction("kk", new Date(10, 2, 2017), 15000);
		Transaction t3 = new Transaction("kk", new Date(2, 9, 2017), 2000);
		
		List<Transaction> tlist = new ArrayList<Transaction>();
		tlist.add(t1);
		tlist.add(t2);
		tlist.add(t3);
		
		ShowTransaction(tlist);
		System.out.println("------------------------");
		
		System.out.println("t1.equals(t2): " + t1.equals(t2));
		System.out.println("t1.equals(t3): " + t1.equals(t3));
		System.out.println("t1.equals(t1): " + t1.equals(t1));
	}
}
