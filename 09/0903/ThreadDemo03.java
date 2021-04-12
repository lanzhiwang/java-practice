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

public class ThreadDemo03 {

	public static void main(String args[]) {
		MyThread mt1 = new MyThread("线程A ");
		mt1.start();
		mt1.start();
	}
}

/*
localhost:0903 huzhi$ javac ThreadDemo03.java
localhost:0903 huzhi$ java ThreadDemo03
线程A 运行 = 0
Exception in thread "main" 线程A 运行 = 1
线程A 运行 = 2
线程A 运行 = 3
线程A 运行 = 4
线程A 运行 = 5
线程A 运行 = 6
线程A 运行 = 7
线程A 运行 = 8
线程A 运行 = 9
java.lang.IllegalThreadStateException
	at java.lang.Thread.start(Thread.java:708)
	at ThreadDemo03.main(ThreadDemo03.java:20)
localhost:0903 huzhi$

*/