class Info<T extends Number> {
	private T var;

	public void setVar(T var) {
		this.var = var;
	}

	public T getVar() {
		return this.var;
	}

	public String toString() {
		return this.var.toString();
	}
}

public class GenericsDemo19 {
	public static void main(String args[]) {
		Info<Integer> i1 = new Info<Integer>();
	}
}
