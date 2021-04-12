class MyThread extends Thread {
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

public class ThreadDemo04 {
	public static void main(String args[]) {
		MyThread mt1 = new MyThread("A");
		MyThread mt2 = new MyThread("B");
		MyThread mt3 = new MyThread("C");
		mt1.start();
		mt2.start();
		mt3.start();
	}
}

/*
localhost:0906 huzhi$ javac ThreadDemo04.java
localhost:0906 huzhi$ java ThreadDemo04
B卖票 ticket = 5
B卖票 ticket = 4
B卖票 ticket = 3
B卖票 ticket = 2
B卖票 ticket = 1
A卖票 ticket = 5
A卖票 ticket = 4
A卖票 ticket = 3
A卖票 ticket = 2
A卖票 ticket = 1
C卖票 ticket = 5
C卖票 ticket = 4
C卖票 ticket = 3
C卖票 ticket = 2
C卖票 ticket = 1
localhost:0906 huzhi$

*/
