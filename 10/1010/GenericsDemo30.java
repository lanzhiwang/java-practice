public class GenericsDemo30 {
	public static void main(String args[]) {
		Integer i[] = fun1(1, 2, 3, 4, 5, 6);
		fun2(i);
	}

	public static <T> T[] fun1(T ...arg) {
		return arg;
	}

	public static <T> void fun2(T param[]) {
		System.out.print("接收泛型数组");
		for(T t:param){
			System.out.print(t + "、");
		}
	}
}

/*
localhost:1010 huzhi$ javac -Xlint:unchecked GenericsDemo30.java
GenericsDemo30.java:7: 警告: [unchecked] 参数化 vararg 类型T的堆可能已受污染
	public static <T> T[] fun1(T ...arg) {
	                                ^
  其中, T是类型变量:
    T扩展已在方法 <T>fun1(T...)中声明的Object
1 个警告
localhost:1010 huzhi$ ll
total 16
drwxr-xr-x   4 huzhi  staff   128  4 13 15:00 ./
drwxr-xr-x  13 huzhi  staff   416  4 13 14:55 ../
-rw-r--r--   1 huzhi  staff  1208  4 13 15:00 GenericsDemo30.class
-rw-rw-r--   1 huzhi  staff   353  4 13 15:00 GenericsDemo30.java
localhost:1010 huzhi$
localhost:1010 huzhi$ java GenericsDemo30
接收泛型数组1、2、3、4、5、6、
localhost:1010 huzhi$
*/
