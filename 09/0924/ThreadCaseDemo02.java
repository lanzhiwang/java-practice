class Info {
	private String name = "李新华";
	private String content = "JAVA讲师";

    public synchronized void set(String name,String content) {
		this.setName(name);
		try {
			Thread.sleep(300);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		this.setContent(content);
	}

	public synchronized void get() {
		try{
			Thread.sleep(300);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + " --> " + this.getContent());
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

public class ThreadCaseDemo02 {
	public static void main(String args[]) {
		Info info = new Info();
		Producer pro = new Producer(info);
		Consumer con = new Consumer(info);
		new Thread(pro).start();
		new Thread(con).start();
	}
}

/*
localhost:0924 huzhi$ java ThreadCaseDemo02
李新华 --> JAVA讲师
李新华 --> JAVA讲师
李新华 --> JAVA讲师
李新华 --> JAVA讲师
李新华 --> JAVA讲师
李新华 --> JAVA讲师
李新华 --> JAVA讲师
李新华 --> JAVA讲师
李新华 --> JAVA讲师
李新华 --> JAVA讲师
localhost:0924 huzhi$

*/
