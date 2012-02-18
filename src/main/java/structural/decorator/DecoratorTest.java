package structural.decorator;

public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteComponent component = new ConcreteComponent();
		
		ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);
		ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(decoratorA);
		
		decoratorB.operation();
	}

}
