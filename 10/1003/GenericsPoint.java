class Point<T> {
	private T x;
	private T y;

	public void setX(T x) {
		this.x = x;
	}

	public void setY(T y) {
		this.y = y;
	}

	public T getX() {
		return this.x;
	}

	public T getY() {
		return this.y;
	}
}

public class GenericsPoint {
	public static void main(String args[]) {
		Point<Integer> p = new Point<Integer>();
		p.setX(10);
		p.setY(20);
		int x = p.getX();
		int y = p.getY();
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
