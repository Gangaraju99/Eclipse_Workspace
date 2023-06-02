package Oops;

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double findDistance() {
		double result = Math.sqrt(Math.pow(this.x - 0, 2)) + Math.pow(this.y - 0, 2);
		return result;

	}

	public double findDistance(Point p) {
		double result = Math.sqrt(Math.pow( p.x -this.x, 2)) + Math.pow(p.y-this.y , 2);
		return result;

	}

}

public class Overloading_Method {

	public static void main(String[] args) {

		Point p1 = new Point(6, 8);
		double res = p1.findDistance();
		System.out.println("Distance b/w (0,0) and (" + p1.getX() + "," + p1.getY() + ") is :" + res);

		Point p2 = new Point(3, 5);
		res = p1.findDistance(p2);
		System.out.println("Distance b/w (" + p1.getX() + "," + p1.getY() + ") and ( "+p2.getX()+","+p2.getY()+") is :"+
res);
	}

}
