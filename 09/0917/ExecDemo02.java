class MyThread implements Runnable {
	private String name;
	private int time;

	public MyThread(String name, int time) {
		this.name = name;
		this.time = time;
	}

	public void run() {
		try {
			Thread.sleep(this.time);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " 线程休眠 " + this.time + "毫秒");
	}
}

public class ExecDemo02 {
	public static void main(String args[]) {
		MyThread mt1 = new MyThread("A", 10000);
		MyThread mt2 = new MyThread("B", 20000);
		MyThread mt3 = new MyThread("C", 30000);
		new Thread(mt1).start();
		new Thread(mt2).start();
		new Thread(mt3).start();
	}
}
