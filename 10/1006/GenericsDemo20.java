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

public class GenericsDemo20 {
	public static void main(String args[]) {
		Info<String> i1 = new Info<String>();
	}
}
