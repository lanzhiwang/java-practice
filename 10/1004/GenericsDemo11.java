class Info<T> {
	private T var;

	public T getVar() {
		return this.var;
	}

	public void setVar(T var) {
		this.var = var;
	}

	public String toString() {
		return this.var.toString();
	}
}

public class GenericsDemo11 {
	public static void main(String args[]) {
		Info<Object> i = new Info<Object>();
		i.setVar("MLDN");
		System.out.println("i = " + i.getVar());
	}
}
