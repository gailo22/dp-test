package structural.brigde;

public class Abstraction {

	protected Implementor implementor;

	public Implementor getImplementor() {
		return implementor;
	}

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
	protected void operation() {
		implementor.operation();
	}
}
