package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle (int length, int width) {
		this.length = length;
		this.width = width;
		
	}
	public int area () {
		return length*width;
	}
	
	public int perimeter () {
		return 2*(length+width);
	}
	
	public boolean isSquare() {
		if (length == width) {
		return true;
	} else {
		return false;}
	}
	
	public boolean isGreater(Rectangle r2) {
		if (this.area() > r2.area()) {
		return true;
		} else {
			return false;
		}
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5,3);
		Rectangle r2 = new Rectangle (4,6);
		
		System.out.println ("area is " + r2.area());
		System.out.println( "perimeter is " + r2.perimeter());
		
		if (r.isGreater(r2) == true) {
			System.out.println(" r is larger than r2");
		} else {
			System.out.println(" r2 is larger than r");
		}
		if (r.isSquare() == true ) {
			System.out.println(" r is a square");
		} else {
			System.out.println(" r is not a square");
		}
//		StdDraw.setPenColor(StdDraw.BLACK);
//		StdDraw.filledRectangle(0.5,0.5,0.1*r.width,0.1*r.length);
		
		System.out.println(r);
		
	}

}
