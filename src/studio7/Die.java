package studio7;

public class Die {
	private int n; 
	public Die (int n) {
		this.n = n;
	}
	
	public int roll() {
		return (int)(Math.random()*this.n)+1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d = new Die(6);
		System.out.print(d.roll());
	}

}
