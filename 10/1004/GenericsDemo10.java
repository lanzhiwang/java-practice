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

public class GenericsDemo10 {
	public static void main(String args[]) {
		Info i = new Info();
		i.setVar("MLDN");
		System.out.println("i = " + i.getVar());
	}
}
