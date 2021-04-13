interface Info<T> {
	public T getVar();
}

class InfoImpl implements Info<String> {
	private String var;

	public InfoImpl(String var) {
		this.setVar(var);
	}

	public void setVar(String var) {
		this.var = var;
	}

	public String getVar() {
		return this.var;
	}
}

public class GenericsDemo25 {
	public static void main(String arsg[]) {
		Info<String> i = null;
		i = new InfoImpl("msdn");
		System.out.println("i = " + i.getVar());
	}
}
