class MyThread implements Runnable {
	private boolean flag = true;

	public void run() {
		int i = 0;
		while (this.flag) {
			System.out.println(Thread.currentThread().getName() +"运行, i = " + (i++));
		}
	}

	public void stop() {
		this.flag = false;
	}
}

public class StopDemo {
	public static void main(String args[]) {
		MyThread my = new MyThread();
		Thread t = new Thread(my, "线程");
		t.start();
		try {
			Thread.sleep(1);
		} catch(Exception e) {
		}
		my.stop();
	}
}

/*
localhost:0926 huzhi$ javac StopDemo.java
localhost:0926 huzhi$ java StopDemo
线程运行, i = 0
线程运行, i = 1
线程运行, i = 2
线程运行, i = 3
线程运行, i = 4
线程运行, i = 5
线程运行, i = 6
线程运行, i = 7
线程运行, i = 8
线程运行, i = 9
线程运行, i = 10
线程运行, i = 11
线程运行, i = 12
线程运行, i = 13
线程运行, i = 14
线程运行, i = 15
线程运行, i = 16
线程运行, i = 17
线程运行, i = 18
线程运行, i = 19
线程运行, i = 20
线程运行, i = 21
线程运行, i = 22
线程运行, i = 23
线程运行, i = 24
线程运行, i = 25
线程运行, i = 26
线程运行, i = 27
线程运行, i = 28
线程运行, i = 29
线程运行, i = 30
线程运行, i = 31
线程运行, i = 32
线程运行, i = 33
线程运行, i = 34
线程运行, i = 35
线程运行, i = 36
线程运行, i = 37
localhost:0926 huzhi$

*/
