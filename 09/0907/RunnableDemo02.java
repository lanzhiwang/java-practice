class MyThread implements Runnable {
	private int ticket = 5;
	private String name;

	public MyThread(String name) {
		this.name = name;
	}

	public void run() {
		for(int i = 0; i < 100; i++) {
			if(this.ticket > 0) {
				System.out.println(this.name + "卖票 ticket = " + this.ticket);
				this.ticket--;
			}
		}
	}
}

public class RunnableDemo02 {
	public static void main(String args[]) {
		MyThread mt = new MyThread("A");
		new Thread(mt).run();
		new Thread(mt).run();
		new Thread(mt).run();
	}
}

/*
localhost:0907 huzhi$ javac RunnableDemo02.java
localhost:0907 huzhi$ java RunnableDemo02
A卖票 ticket = 5
A卖票 ticket = 4
A卖票 ticket = 3
A卖票 ticket = 2
A卖票 ticket = 1
localhost:0907 huzhi$

*/
