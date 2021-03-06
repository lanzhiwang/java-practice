class Info {
	private String name = "李新华";
	private String content = "JAVA讲师";

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
		for(int i = 0; i < 50; i++) {
			if (flag) {
				this.info.setName("李新华");
				try {
					Thread.sleep(90);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				this.info.setContent("JAVA讲师");
				flag = false;
			} else {
				this.info.setName("mldn");
				try {
					Thread.sleep(90);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				this.info.setContent("www.mldnjava.cn");
				flag = true;
			}
		}
	}
}

class Consumer implements Runnable {
	private Info info = null;

	public Consumer(Info info) {
		this.info = info;
	}

	public void run() {
		for(int i = 0; i < 50; i++) {
			try{
				Thread.sleep(90);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.info.getName() + " --> " + this.info.getContent());
		}
	}
}

public class ThreadCaseDemo01 {
	public static void main(String args[]) {
		Info info = new Info();
		Producer pro = new Producer(info);
		Consumer con = new Consumer(info);
		new Thread(pro).start();
		new Thread(con).start();
	}
}

/*
localhost:0923 huzhi$ java ThreadCaseDemo01
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
mldn --> JAVA讲师
李新华 --> www.mldnjava.cn
李新华 --> JAVA讲师
localhost:0923 huzhi$

*/
