class MyThread implements Runnable {
	public void run() {
		System.out.println("1、进入 run 方法");
		try {
			Thread.sleep(10000);
			System.out.println("2、已经完成休眠");
		} catch(InterruptedException e) {
			System.out.println("3、休眠被中止");
			return;
		}
		System.out.println("4、run 方法正常结束");
	}
}

public class ThreadInterruptDemo {
	public static void main(String args[]) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt, "线程");
		t.start();
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
		}
		t.interrupt();
	}
}

/*
localhost:0913 huzhi$ javac ThreadInterruptDemo.java
localhost:0913 huzhi$ java ThreadInterruptDemo
1、进入 run 方法
3、休眠被中止
localhost:0913 huzhi$

*/
