class Notepad<K, V> {
	private K key;
	private V value;

	public K getKey(){
		return this.key;
	}

	public V getValue() {
		return this.value;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}
}

public class GenericsDemo09 {
	public static void main(String args[]) {
		Notepad<String, Integer> t = null;
		t = new Notepad<String, Integer>();
		t.setKey("msdn");
		t.setValue(30);
		System.out.print("key = " + t.getKey());
		System.out.print("value = " + t.getValue());

	}
}
