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


public class GenericsDemo03 {
	public static void main(String args[]) {
		Point p = new Point();
		p.setX("北纬");
		p.setY("东经");
		String x = (String)p.getX();
		String y = (String)p.getY();
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}

/*
localhost:1001 huzhi$ java GenericsDemo03
x = 北纬
y = 东经
localhost:1001 huzhi$
*/
