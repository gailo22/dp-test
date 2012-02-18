package behavioral.strategy;

public class StrategyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context;
		
		context = new Context(new ConcreteStrategyA());
		context.contextInterface();

		context = new Context(new ConcreteStrategyB());
		context.contextInterface();
		
		context = new Context(new ConcreteStrategyC());
		context.contextInterface();
		
	}

}
