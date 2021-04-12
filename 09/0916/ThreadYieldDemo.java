class MyThread implements Runnable {
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch(Exception e) {
			}
			System.out.println(Thread.currentThread().getName() + "运行 i = " + i);
			if(i == 2) {
				System.out.print("线程礼让: ");
				Thread.currentThread().yield();
			}
		}
	}
}

public class ThreadYieldDemo {
	public static void main(String args[]) {
		MyThread my = new MyThread();
		Thread t1 = new Thread(my, "A");
		Thread t2 = new Thread(my, "B");
		t1.start();
		t2.start();
	}
}
