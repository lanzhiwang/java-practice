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

public class GenericsDemo12 {
	public static void main(String args[]) {
		Info<String> i = new Info<String>();
		i.setVar("MLDN");
		fun(i);
	}

	public static void fun(Info<Object> temp) {
		System.out.println("temp = " + temp);
	}
}

/*
localhost:1005 huzhi$ javac GenericsDemo12.java
GenericsDemo12.java:21: 错误: 不兼容的类型: Info<String>无法转换为Info<Object>
		fun(i);
		    ^
注: 某些消息已经过简化; 请使用 -Xdiags:verbose 重新编译以获得完整输出
1 个错误
localhost:1005 huzhi$
localhost:1005 huzhi$ javac -Xdiags:verbose GenericsDemo12.java
GenericsDemo12.java:21: 错误: 无法将类 GenericsDemo12中的方法 fun应用到给定类型;
		fun(i);
		^
  需要: Info<Object>
  找到: Info<String>
  原因: 参数不匹配; Info<String>无法转换为Info<Object>
1 个错误
localhost:1005 huzhi$
*/
