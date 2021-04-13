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

public class GenericsDemo23 {
	public static void main(String args[]) {
		Info<String> i1 = new Info<String>();
		Info<Object> i2 = null;
		i2 = i1;
	}
}

/*
localhost:1007 huzhi$ javac GenericsDemo23.java
GenericsDemo23.java:21: 错误: 不兼容的类型: Info<String>无法转换为Info<Object>
		i2 = i1;
		     ^
1 个错误
localhost:1007 huzhi$
*/
