class MyThread implements Runnable {
	private int ticket = 5;

	public void run() {
		for(int i = 0; i < 100; i++) {
			this.sale();
		}
	}

	public synchronized void sale() {
		if(this.ticket > 0) {
			try {
				Thread.sleep(300);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " 卖票 ticket = " + this.ticket);
			this.ticket--;
		}

	}
}

public class SyncDemo03 {
	public static void main(String args[]) {
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		Thread t3 = new Thread(mt);
		t1.start();
		t2.start();
		t3.start();
	}
}

/*
localhost:0921 huzhi$ javac SyncDemo03.java
localhost:0921 huzhi$ java SyncDemo03
Thread-0 卖票 ticket = 5
Thread-0 卖票 ticket = 4
Thread-0 卖票 ticket = 3
Thread-0 卖票 ticket = 2
Thread-0 卖票 ticket = 1
localhost:0921 huzhi$

*/
