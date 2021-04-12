class MyThread implements Runnable {
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "运行 i = " + i);
		}
	}
}

public class ThreadNameDemo {
	public static void main(String args[]) {
		MyThread mt = new MyThread();
		new Thread(mt).start();
		new Thread(mt, "thread-A").start();
		new Thread(mt, "thread-B").start();
		new Thread(mt).start();
		new Thread(mt).start();
	}
}

/*
localhost:0908 huzhi$ java ThreadNameDemo
Thread-0运行 i = 0
Thread-0运行 i = 1
Thread-0运行 i = 2
thread-B运行 i = 0
thread-B运行 i = 1
thread-B运行 i = 2
thread-A运行 i = 0
Thread-2运行 i = 0
Thread-2运行 i = 1
Thread-2运行 i = 2
Thread-1运行 i = 0
Thread-1运行 i = 1
Thread-1运行 i = 2
thread-A运行 i = 1
thread-A运行 i = 2
localhost:0908 huzhi$

*/
