class Point {
	private Object x;
	private Object y;

	public void setX(Object x) {
		this.x = x;
	}

	public void setY(Object y) {
		this.y = y;
	}

	public Object getX() {
		return this.x;
	}

	public Object getY() {
		return this.y;
	}
}

public class GenericsDemo01 {
	public static void main(String args[]) {
		Point p = new Point();
		p.setX(10);
		p.setY(20);
		int x = (Integer)p.getX();
		int y = (Integer)p.getY();
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}

/*
localhost:1001 huzhi$ javac GenericsDemo01.java
localhost:1001 huzhi$ java GenericsDemo01
x = 10
y = 20
localhost:1001 huzhi$

*/
