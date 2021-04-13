class Point<T> {
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
}

public class GenericsDemo06 {
	public static void main(String args[]) {
		Point<String> p = new Point<String>();
		p.setVar("MLDN");
		System.out.println(p.getVar().length());
	}
}

/*
localhost:1002 huzhi$ javac GenericsDemo06.java
localhost:1002 huzhi$ java GenericsDemo06
4
localhost:1002 huzhi$

*/
