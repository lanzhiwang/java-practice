class Point<T> {
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
}

public class GenericsDemo07 {
	public static void main(String args[]) {
		Point<Integer> p = new Point<Integer>();
		p.setVar("MLDN");
	}
}

/*
localhost:1002 huzhi$ javac GenericsDemo07.java
GenericsDemo07.java:16: 错误: 不兼容的类型: String无法转换为Integer
		p.setVar("MLDN");
		         ^
注: 某些消息已经过简化; 请使用 -Xdiags:verbose 重新编译以获得完整输出
1 个错误
localhost:1002 huzhi$
localhost:1002 huzhi$ javac -Xdiags:verbose GenericsDemo07.java
GenericsDemo07.java:16: 错误: 无法将类 Point<T>中的方法 setVar应用到给定类型;
		p.setVar("MLDN");
		 ^
  需要: Integer
  找到: String
  原因: 参数不匹配; String无法转换为Integer
  其中, T是类型变量:
    T扩展已在类 Point中声明的Object
1 个错误
localhost:1002 huzhi$

*/
