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

public class GenericsDemo04 {
	public static void main(String args[]) {
		Point p = new Point();
		p.setX(10);
		p.setY("东经");
		int x = (Integer)p.getX();
		int y = (Integer)p.getY();
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}

/*
localhost:1001 huzhi$ java GenericsDemo04
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
	at GenericsDemo04.main(GenericsDemo04.java:28)
localhost:1001 huzhi$

*/
