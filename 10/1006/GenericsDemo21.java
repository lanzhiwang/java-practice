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

public class GenericsDemo21 {
	public static void main(String args[]) {
		Info<String> i1 = new Info<String>();
		Info<Object> i2 = new Info<Object>();
		i1.setVar("hello");
		i2.setVar(new Object());
		fun(i1);
		fun(i2);
	}

	public static void fun(Info<? super String> temp) {
		System.out.println("temp = " + temp);
	}
}
