class Info {
	private String name = "李新华";
	private String content = "JAVA讲师";
	private boolean flag = false;

	public synchronized void set(String name, String content) {
		if (!this.flag) {
			try {
				super.wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.setName(name);
		try {
			Thread.sleep(300) ;
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		this.setContent(content);
		this.flag  = false;
		super.notify();
	}

	public synchronized void get() {
		if (this.flag) {
			try {
				super.wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(300);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + " --> " + this.getContent());
		this.flag  = true;
		super.notify();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return this.name;
	}

	public String getContent() {
		return this.content;
	}

}



class Producer implements Runnable {
	private Info info = null;

	public Producer(Info info) {
		this.info = info;
	}

	public void run() {
		boolean flag = false;
		for(int i = 0; i < 10; i++) {
			if (flag) {
				this.info.set("李新华", "JAVA讲师");
				flag = false;
			} else {
				this.info.set("mldn", "www.mldnjava.cn");
				flag = true;
			}
		}
	}
}

class Consumer implements Runnable{
	private Info info = null;

	public Consumer(Info info) {
		this.info = info;
	}

	public void run() {
		for(int i = 0; i < 10; i++) {
			this.info.get();
		}
	}
}

public class ThreadCaseDemo03 {
	public static void main(String args[]) {
		Info info = new Info();
		Producer pro = new Producer(info);
		Consumer con = new Consumer(info);
		new Thread(pro).start();
		new Thread(con).start();
	}
}

/*
localhost:0925 huzhi$ java ThreadCaseDemo03
李新华 --> JAVA讲师
mldn --> www.mldnjava.cn
李新华 --> JAVA讲师
mldn --> www.mldnjava.cn
李新华 --> JAVA讲师
mldn --> www.mldnjava.cn
李新华 --> JAVA讲师
mldn --> www.mldnjava.cn
李新华 --> JAVA讲师
mldn --> www.mldnjava.cn
localhost:0925 huzhi$

*/
