class Point<T> {
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
}

public class GenericsDemo05 {
	public static void main(String args[]) {
		Point<Integer> p = new Point<Integer>();
		p.setVar(30);
		System.out.println(p.getVar() * 2);
	}
}

/*
localhost:1002 huzhi$ javac GenericsDemo05.java
localhost:1002 huzhi$ java GenericsDemo05
60
localhost:1002 huzhi$

*/
