class Info<T> {
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

public class GenericsDemo18 {
	public static void main(String args[]) {
		Info<String> i1 = new Info<String>();
		i1.setVar("hello");
		fun(i1);
	}

	public static void fun(Info<? extends Number> temp) {
		System.out.println("temp = " + temp);
	}
}
