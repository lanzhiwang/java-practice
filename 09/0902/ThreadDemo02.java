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

public class ThreadDemo02 {

	public static void main(String args[]) {
		MyThread mt1 = new MyThread("线程A ");
		MyThread mt2 = new MyThread("线程B ");
		mt1.start();
		mt2.start();
	}
}

/*
localhost:0902 huzhi$ javac ThreadDemo02.java
localhost:0902 huzhi$ ll
total 24
drwxr-xr-x  5 huzhi  staff  160  4 12 10:21 ./
drwxr-xr-x  5 huzhi  staff  160  4 12 10:19 ../
-rw-r--r--  1 huzhi  staff  719  4 12 10:21 MyThread.class
-rw-r--r--  1 huzhi  staff  407  4 12 10:21 ThreadDemo02.class
-rw-rw-r--  1 huzhi  staff  434  4 12 10:20 ThreadDemo02.java
localhost:0902 huzhi$
localhost:0902 huzhi$
localhost:0902 huzhi$
localhost:0902 huzhi$ java ThreadDemo02
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
localhost:0902 huzhi$ java ThreadDemo02
线程A 运行 = 0
线程A 运行 = 1
线程B 运行 = 0
线程B 运行 = 1
线程B 运行 = 2
线程A 运行 = 2
线程B 运行 = 3
线程B 运行 = 4
线程B 运行 = 5
线程B 运行 = 6
线程B 运行 = 7
线程B 运行 = 8
线程B 运行 = 9
线程A 运行 = 3
线程A 运行 = 4
线程A 运行 = 5
线程A 运行 = 6
线程A 运行 = 7
线程A 运行 = 8
线程A 运行 = 9
localhost:0902 huzhi$

*/