class MyThread implements Runnable {
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "运行 i = " + i);
		}
	}
}

public class ThreadAliveDemo {
	public static void main(String args[]) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt, "线程");
		System.out.println("线程开始执行之前 --> " + t.isAlive());
		t.start();
		System.out.println("线程开始执行之后 --> " + t.isAlive());
		for(int i = 0; i < 3 ; i++) {
			System.out.println("main 运行 --> " + i);
		}
		System.out.println("代码执行之后 --> " + t.isAlive());
	}
}

/*
localhost:0910 huzhi$ javac ThreadAliveDemo.java
localhost:0910 huzhi$ java ThreadAliveDemo
线程开始执行之前 --> false
线程开始执行之后 --> true
main 运行 --> 0
main 运行 --> 1
main 运行 --> 2
线程运行 i = 0
代码执行之后 --> true
线程运行 i = 1
线程运行 i = 2
localhost:0910 huzhi$

*/
