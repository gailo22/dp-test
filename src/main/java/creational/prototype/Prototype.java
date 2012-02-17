package creational.prototype;

public abstract class Prototype implements Cloneable {

	private String id;
	
	public Prototype(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
