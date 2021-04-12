class MyThread extends Thread {
	private String name;

	public MyThread(String name) {
		this.name = name;
	}

	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(name + "运行 = " + i);
		}
	}
}

public class ThreadDemo01 {

	public static void main(String args[]) {
		MyThread mt1 = new MyThread("线程A ");
		MyThread mt2 = new MyThread("线程B ");
		mt1.run();
		mt2.run();
	}
}

/*
localhost:0901 huzhi$ javac ThreadDemo01.java
localhost:0901 huzhi$ ll
total 24
drwxr-xr-x  5 huzhi  staff  160  4 12 10:17 ./
drwxr-xr-x  4 huzhi  staff  128  4 12 10:11 ../
-rw-r--r--  1 huzhi  staff  719  4 12 10:17 MyThread.class
-rw-r--r--  1 huzhi  staff  405  4 12 10:17 ThreadDemo01.class
-rw-rw-r--  1 huzhi  staff  432  4 12 10:15 ThreadDemo01.java
localhost:0901 huzhi$
localhost:0901 huzhi$
localhost:0901 huzhi$ java ThreadDemo01
线程A 运行 = 0
线程A 运行 = 1
线程A 运行 = 2
线程A 运行 = 3
线程A 运行 = 4
线程A 运行 = 5
线程A 运行 = 6
线程A 运行 = 7
线程A 运行 = 8
线程A 运行 = 9
线程B 运行 = 0
线程B 运行 = 1
线程B 运行 = 2
线程B 运行 = 3
线程B 运行 = 4
线程B 运行 = 5
线程B 运行 = 6
线程B 运行 = 7
线程B 运行 = 8
线程B 运行 = 9
localhost:0901 huzhi$

*/
