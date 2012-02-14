package abstractfactory;

public class Client {
	
	private AbstractProductA productA;
	private AbstractProductB productB;
	
	public Client(AbstractFactory factory) {
		this.productA = factory.CreateProductA();
		this.productB = factory.CreateProductB();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Client client = new Client(new ConcreteFacroty1());
		client.productB.doSomething();
		
		client = new Client(new ConcreteFactory2());
		client.productB.doSomething();
	}
	

}
