class MyThread implements Runnable {
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "运行 i = " + i);
		}
	}
}

public class CurrentThreadDemo {
	public static void main(String args[]) {
		MyThread mt = new MyThread();
		new Thread(mt, "A").start();
		mt.run();
	}
}

/*
localhost:0909 huzhi$ javac CurrentThreadDemo.java
localhost:0909 huzhi$ java CurrentThreadDemo
main运行 i = 0
main运行 i = 1
main运行 i = 2
A运行 i = 0
A运行 i = 1
A运行 i = 2
localhost:0909 huzhi$ java CurrentThreadDemo
main运行 i = 0
main运行 i = 1
main运行 i = 2
A运行 i = 0
A运行 i = 1
A运行 i = 2
localhost:0909 huzhi$ java CurrentThreadDemo
main运行 i = 0
main运行 i = 1
A运行 i = 0
A运行 i = 1
main运行 i = 2
A运行 i = 2
localhost:0909 huzhi$

*/
