class MyThread implements Runnable {
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName() + "运行 i = " + i);
		}
	}
}

public class ThreadPriorityDemo {
	public static void main(String args[]) {
		Thread t1 = new Thread(new MyThread(), "A");
		Thread t2 = new Thread(new MyThread(), "B");
		Thread t3 = new Thread(new MyThread(), "C");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}
