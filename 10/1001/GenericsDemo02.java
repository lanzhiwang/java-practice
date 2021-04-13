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

public class GenericsDemo02 {
	public static void main(String args[]) {
		Point p = new Point();
		p.setX(10.5f);
		p.setY(20.6f);
		float x = (Float)p.getX();
		float y = (Float)p.getY();
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}

/*
localhost:1001 huzhi$ java GenericsDemo02
x = 10.5
y = 20.6
localhost:1001 huzhi$
*/
