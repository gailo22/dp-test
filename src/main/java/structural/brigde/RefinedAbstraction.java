package structural.brigde;

public class RefinedAbstraction extends Abstraction {

	@Override
	protected void operation() {
		implementor.operation();
	}

}
