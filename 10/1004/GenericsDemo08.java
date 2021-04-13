class Point<T> {
	private T var;

	public Point(T var) {
		this.var = var;
	}

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
}

public class GenericsDemo08 {
	public static void main(String args[]) {
		Point<String> p = new Point<String>("MLDN");
		System.out.println("p = " + p.getVar());
	}
}
