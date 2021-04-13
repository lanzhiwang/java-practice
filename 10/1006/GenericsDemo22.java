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

public class GenericsDemo22 {
	public static void main(String args[]) {
		Info<Integer> i1 = new Info<Integer>();
		i1.setVar(30);
		fun(i1);
	}
	public static void fun(Info<? super String> temp) {
		System.out.println("temp = " + temp);
	}
}
