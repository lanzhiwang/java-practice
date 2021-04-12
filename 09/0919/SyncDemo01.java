class MyThread implements Runnable {
	private int ticket = 5;

	public void run() {
		for(int i = 0; i < 100; i++) {
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
}

public class SyncDemo01 {
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
localhost:0919 huzhi$ javac SyncDemo01.java
localhost:0919 huzhi$ java SyncDemo01
Thread-1 卖票 ticket = 5
Thread-0 卖票 ticket = 5
Thread-2 卖票 ticket = 5
Thread-0 卖票 ticket = 2
Thread-2 卖票 ticket = 2
Thread-1 卖票 ticket = 2
Thread-0 卖票 ticket = -1
localhost:0919 huzhi$ java SyncDemo01
Thread-0 卖票 ticket = 5
Thread-2 卖票 ticket = 5
Thread-1 卖票 ticket = 5
Thread-0 卖票 ticket = 2
Thread-1 卖票 ticket = 2
Thread-2 卖票 ticket = 2
Thread-0 卖票 ticket = -1
localhost:0919 huzhi$ java SyncDemo01
Thread-2 卖票 ticket = 5
Thread-1 卖票 ticket = 5
Thread-0 卖票 ticket = 5
Thread-2 卖票 ticket = 2
Thread-1 卖票 ticket = 2
Thread-0 卖票 ticket = 2
Thread-2 卖票 ticket = -1
localhost:0919 huzhi$

*/
