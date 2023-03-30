package studio7;

public class Fraction {
	
	private int numerator; 
	private int denominator; 

	public Fraction (int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction multiply(Fraction n2) {
		int numerator = (n2.numerator * this.numerator);
		int denominator = (n2.denominator * this.denominator);
		Fraction r = new Fraction(numerator,denominator);
		return r;
				
	}
	
	public Fraction sum(Fraction n3) {
		int numerator1 = (n3.denominator * this.numerator);
		int denominator1 = (n3.denominator * this.denominator);
		int numerator2 = (this.denominator * n3.numerator);
		int finaln = (numerator1 + numerator2);
		Fraction r = new Fraction(finaln,denominator1);
		return r;
				
	}
	
	public Fraction reciprocal(Fraction n4) {
		Fraction r = new Fraction(n4.denominator,n4.numerator);
		return r;
				
	}
	
	

	@Override
	public String toString() {
		return "Fraction " + numerator + "/" + denominator;
	}

	public static void main(String[] args) {
		Fraction f = new Fraction(2,4);
		Fraction f2 = new Fraction(3,5);
		
		System.out.println(f);
		System.out.println(f.multiply(f2));
		System.out.println(f.sum(f2));
		System.out.println(f.reciprocal(f2));
	}

}
