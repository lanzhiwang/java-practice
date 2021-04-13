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

public class GenericsDemo29 {
	public static void main(String args[]) {
		Info<Integer> i1 = new Info<Integer>();
		Info<String> i2 = new Info<String>();
		i1.setVar(30);
		i2.setVar("world")
		add(i1, i2);
	}

	public static <T> void add(Info<T> i1, Info<T> i2) {
		System.out.println(i1.getVar() + " " + i2.getVar());
	}
}

