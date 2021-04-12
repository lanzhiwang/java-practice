class MyThread implements Runnable {
	private String name;

	public MyThread(String name){
		this.name = name;
	}

	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(name + "运行, i = " + i);
		}
	}
}

public class RunnableDemo01 {
	public static void main(String args[]) {
		MyThread mt1 = new MyThread("线程A ");
		MyThread mt2 = new MyThread("线程B ");

		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		t1.start();
		t2.start();
	}
}

/*
localhost:0904 huzhi$ javac RunnableDemo01.java
localhost:0904 huzhi$ java RunnableDemo01
线程A 运行, i = 0
线程A 运行, i = 1
线程A 运行, i = 2
线程A 运行, i = 3
线程B 运行, i = 0
线程B 运行, i = 1
线程A 运行, i = 4
线程B 运行, i = 2
线程B 运行, i = 3
线程B 运行, i = 4
线程B 运行, i = 5
线程B 运行, i = 6
线程B 运行, i = 7
线程B 运行, i = 8
线程B 运行, i = 9
线程A 运行, i = 5
线程A 运行, i = 6
线程A 运行, i = 7
线程A 运行, i = 8
线程A 运行, i = 9
localhost:0904 huzhi$

*/
