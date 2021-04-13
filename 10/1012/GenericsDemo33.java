interface Info {}

class Contact implements Info {
	private String address;
	private String telphone;
	private String zipcode;

	public Contact(String address, String telphone, String zipcode) {
		this.setAddress(address);
		this.setTelphone(telphone);
		this.setZipcode(zipcode);
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return this.address;
	}

	public String getTelphone() {
		return this.telphone;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public String toString() {
		return "Contact" + "\n" +
				"\t" + this.telphone + "\n" +
				"\t" + this.address + "\n" +
				"\t" + this.zipcode;
	}
}

class Introduction implements Info {
	private String name;
	private String sex;
	private int age;

	public Introduction(String name, String sex, int age) {
		this.setName(name);
		this.setSex(sex);
		this.setAge(age);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public String getSex() {
		return this.sex;
	}

	public int getAge() {
		return this.age;
	}

	public String toString() {
		return "Introduction" + "\n" +
				"\t" + this.name + "\n" +
				"\t" + this.sex + "\n" +
				"\t" + this.age;
	}
}

class Person<T extends Info> {
	private T info;

	public Person(T info) {
		this.setInfo(info);
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public T getInfo() {
		return this.info;
	}

	public String toString() {
		return this.info.toString();
	}
}

public class GenericsDemo33 {
	public static void main(String args[]) {
		Person<Introduction> per = null;
		per = new Person<Introduction>(new Introduction("张三", "男", 30));
		System.out.println(per);
	}
}
