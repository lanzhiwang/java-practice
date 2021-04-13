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

public class GenericsDemo14 {
	public static void main(String args[]) {
		Info<String> i = new Info<String>();
		i.setVar("MLDN");
		fun(i);
	}

	public static void fun(Info<?> temp) {
		System.out.println("temp = " + temp);
	}
}

/*
localhost:1005 huzhi$ javac GenericsDemo14.java
localhost:1005 huzhi$ java GenericsDemo14
temp = MLDN
localhost:1005 huzhi$
*/
