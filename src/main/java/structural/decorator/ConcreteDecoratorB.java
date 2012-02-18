package structural.decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		System.out.println("operation from ConcreteDecoratorB...");
		addBehavior();
	}

	private void addBehavior() {
		System.out.println("add behavior from ConcreteDecoratorB...");
	}
	
}
