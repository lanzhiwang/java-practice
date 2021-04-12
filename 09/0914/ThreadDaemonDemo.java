class MyThread implements Runnable {
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "运行 i = " + i);
		}
	}
}

public class ThreadDaemonDemo {
	public static void main(String args[]) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt, "线程");
		t.setDaemon(true);
		t.start();
	}
}

