package chapter1_2_16And17;

import java.util.RandomAccess;

public class Rational implements Comparable<Rational> {
	// ����
	private int numerator;
	// ��ĸ
	private int denominator;
	
	private final int INT_MAX = 2147483647;

	private final int INT_MIN = -2147483647;
	
	private static Rational zero = new Rational(0, 1);
	
	public Rational(int n, int d){
		
		if(d == 0){
			throw new RuntimeException("��ĸ����Ϊ��");
		}
		
		int g = gcd(n,d);
		numerator = n / g;

		denominator = d / g;
		
		if(denominator < 0){
			numerator = -numerator;
			denominator = -denominator;
		}
	}

	/*
	 * ŷ������㷨: �����Լ��
	 */
	
	public int gcd(int n, int d){
		if(n < 0)
			n = -n;
		if(d < 0)
			d = -d;
		if(d == 0)
			return n;
		return gcd(d,n % d);
	}
	
	/*
	 * ����С������
	 */
	public int lcm(int m,int n){
		if(m < 0)
			m = -m;
		if(n < 0)
			n = -n;
		if(n == 0)
			return m;
		else{
			int g  = gcd(m, n);
			// ����
			assert  isOverFlowTimes(m,n/g):"lcm times overflow";
				return m * (n /g);
		}
		
	}
	/*
	 *	���ڷ���1
	 *	С�ڷ���-1
	 *	���ڷ���0
	 */
	public int compareTo(Rational that){
		int lhs = this.numerator * that.denominator;
		int rhs = this.denominator * that.numerator;
		if(lhs > rhs)
			return 1;
		if(lhs < rhs)
			return -1;
		return 0;
	}


	public boolean equals(Rational that){
		if(that == null) 
			return false;
		if(this.getClass() != that.getClass())
			return false;
		return this.compareTo(that) == 0;
	}
	
	/*
	 * �жϼӷ��Ƿ����
	 */
	public boolean isOverFlowPlus(int a, int b){
		return a >= 0 ? INT_MAX - a > b : INT_MIN - a < b;
	}
	
	/*
	 * �жϳ˷��Ƿ����
	 */
	
	public boolean isOverFlowTimes(int a, int b){
		if(a < 0)
			a = -a;
		if(b < 0)
			b = -b;
		if(a == 0 || b == 0)
			return false;
		else
			return INT_MAX / a > b;
	}
	
	public Rational times(Rational b){
		Rational c = new Rational(this.numerator, this.denominator);
		Rational d = new Rational(b.numerator, b.denominator);
		
		assert isOverFlowTimes(c.numerator, d.numerator):"times overflow";
		assert isOverFlowTimes(c.denominator, d.denominator):"times overflow";
		
		return new Rational(c.numerator * d.numerator, c.denominator * d.denominator);
	}
	
	public Rational plus(Rational b){
		if(this.compareTo(zero) == 0)
			return b;
		if(b.compareTo(zero) == 0)
			return this;
		int f = gcd(this.numerator, b.numerator);
		int g = gcd(this.denominator, b.denominator);
		assert isOverFlowPlus((this.numerator / f) * (b.denominator / g), (b.numerator /f) *
				(this.denominator / g)) : "plus overflow";
		Rational s = new Rational((this.numerator / f) * (b.denominator / g) + (b.numerator /f) *
				(this.denominator / g),lcm(this.denominator, b.denominator));
		s.numerator = s.numerator * f;
		return s;
	}
	
	public Rational minus(Rational b){
		Rational temp = new Rational(-b.numerator, b.denominator);
		return this.plus(temp);
	}
	
	public Rational divides(Rational b){
		Rational temp = new Rational(b.denominator, b.numerator);
		return this.times(temp);
	}
	
	public static void main(String[] args) {
		
	}
}
