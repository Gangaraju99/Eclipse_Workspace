package Oops;

class Point {
	private int x;
	private int isy;

	public Point(int x, int y) {
		this.x = x;
		this.isy = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX(int x) {
		return x;

	}

	public void setIsy(int isy) {
		this.isy = isy;
	}

	public int Isy(int isy) {
		return isy;

	}

	public double findDistance() {

		double dist = Math.sqrt(Math.pow(this.x - 0, 2) + Math.pow(this.isy - 0, 2));
		System.out.println(dist);
		return dist;
	}

	public double findDistance(Point p1) {
		double d2 = Math.sqrt(Math.pow(p1.x - this.x, 2) + Math.pow(p1.isy - this.isy, 2));
		
		return d2;
	}
}
public class Olpractise {
public static void main(String[] args) {
	 
	
	Point v = new Point (3,4);
	v.findDistance();
	
	Point p1 = new Point(5,6);
	double r =v.findDistance(p1);
	
	System.out.println(r);
	
	
	
	
}
}
