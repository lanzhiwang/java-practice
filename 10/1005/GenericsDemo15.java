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

public class GenericsDemo15 {
	public static void main(String args[]) {
		Info<?> i = new Info<String>();
		i.setVar("MLDN");
		// i.setVar(null);
		fun(i);
	}

	public static void fun(Info<?> temp) {
		System.out.println("temp = " + temp);
	}
}

/*
localhost:1005 huzhi$ javac GenericsDemo15.java
GenericsDemo15.java:20: 错误: 不兼容的类型: String无法转换为CAP#1
		i.setVar("MLDN");
		         ^
  其中, CAP#1是新类型变量:
    CAP#1从?的捕获扩展Object
注: 某些消息已经过简化; 请使用 -Xdiags:verbose 重新编译以获得完整输出
1 个错误
localhost:1005 huzhi$
localhost:1005 huzhi$ javac -Xdiags:verbose GenericsDemo15.java
GenericsDemo15.java:20: 错误: 无法将类 Info<T>中的方法 setVar应用到给定类型;
		i.setVar("MLDN");
		 ^
  需要: CAP#1
  找到: String
  原因: 参数不匹配; String无法转换为CAP#1
  其中, T是类型变量:
    T扩展已在类 Info中声明的Object
  其中, CAP#1是新类型变量:
    CAP#1从?的捕获扩展Object
1 个错误
localhost:1005 huzhi$
*/
